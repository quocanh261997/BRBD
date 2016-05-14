package com.quanh.brbd;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.provider.Settings;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;

import com.quanh.object.User;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void Login(View view) {
        TextView tv_username = ((EditText) findViewById(R.id.editText2));
        final String username = tv_username==null?"":tv_username.getText().toString();
        if(username!="")
        new AsyncTask<String, Void, String>() {
            @Override
            protected void onPreExecute() {

            }

            @Override
            protected String doInBackground(String... params) {
                String realUrl = "http://192.168.2.3:8080/BookizeWS/webresources/obj.userinfo/" + username;
                return JsonHelper.requestContent(realUrl);
            }

            @Override
            protected void onPostExecute(String res) {

                try {
                    JSONObject js_user = new JSONObject(res);
                    User user = null;
                    user = new User(
                            js_user.getString("userID"),
                            js_user.getString("password"),
                            js_user.getString("name"),
                            js_user.getString("avatar"),
                            js_user.getString("email"),
                            js_user.getString("about")
                    );

                    if (user.getPassword().equals(((EditText) findViewById(R.id.editText3)).getText().toString())) {
                        AccountManager.getInstance().setLoggedin(true);
                        AccountManager.getInstance().setCurrentUser(user);
                        Intent intent = new Intent(LoginActivity.this, UserProfile.class);

                        startActivity(intent);
                    }
                    //result.add(user);

                } catch (JSONException e1) {
                    // manage exceptions
                    System.out.println(e1.getMessage());
                    Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_LONG).show();
                    e1.printStackTrace();
                }


            // dismiss progress dialog
            // Utils.dismissDialog(mDialog);
        }

    }

    .

    executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR); // we target SDK > API 11
}
}
