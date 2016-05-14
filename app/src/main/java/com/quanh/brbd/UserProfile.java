package com.quanh.brbd;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.quanh.object.Post;
import com.quanh.object.User;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class UserProfile extends AppCompatActivity {

    ListView postList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        ((TextView)findViewById(R.id.textView)).setText(AccountManager.getInstance().currentUser.getName());
        ((TextView)findViewById(R.id.textView2)).setText(AccountManager.getInstance().currentUser.getEmail());
        ((TextView)findViewById(R.id.textView3)).setText(AccountManager.getInstance().currentUser.getAbout());

        postList =(ListView) findViewById(R.id.listView);
        findPostByUser(getIntent().hasExtra("query_user")?getIntent().getStringExtra("query_user"):AccountManager.getInstance().currentUser.getUserID(),this,postList);

    }
    private void findPostByUser(final String username, final UserProfile context, final ListView display){
        new AsyncTask<String, Void, String>() {
            @Override
            protected void onPreExecute() {

            }

            @Override
            protected String doInBackground(String... params) {
                String realUrl = "http://192.168.2.3:8080/BookizeWS/webresources/obj.post/user/" + username;
                return JsonHelper.requestContent(realUrl);
            }

            @Override
            protected void onPostExecute(String res) {

                try {
                    List<Post> posts = new ArrayList<>();

                    System.out.println(res);
                    JSONArray js_posts = new JSONArray(res);
                    //JSONArray js_posts = js_base.getJSONArray("posts");

                    for(int i=0;i<js_posts.length();i++) {
                        JSONObject js_post = js_posts.getJSONObject(i);
                        Post post = new Post(
                                js_post.getInt("postID"),
                                js_post.getJSONObject("userID").getString("userID"),
                                js_post.has("bookName")?js_post.getString("bookName"):"",
                                js_post.getInt("star"),
                                js_post.getString("content"),
                                js_post.getString("image"),
                                null
                        );
                        posts.add(post);
                    }
                    display.setAdapter(new PostListAdapter(context, posts));

                } catch (JSONException e1) {
                    // manage exceptions
                    System.out.println(e1.getMessage());
                    Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_LONG).show();
                    e1.printStackTrace();
                }


                // dismiss progress dialog
                // Utils.dismissDialog(mDialog);
            }
        }.execute();
    }
}
