package com.quanh.brbd;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.quanh.object.Post;

import java.io.InputStream;
import java.util.List;

/**
 * Created by The on 5/14/2016.
 */
public class PostListAdapter extends BaseAdapter {
    Context context;
    List<Post> posts;
    private static LayoutInflater inflater=null;
    public PostListAdapter(Activity mainActivity,List<Post> posts) {
        // TODO Auto-generated constructor stub
        context=mainActivity;
        this.posts = posts;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return posts.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView name;
        TextView book_title;
        TextView content;
        ImageView avatar;
        ImageView image;

    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.post_list, null);
        holder.name=(TextView) rowView.findViewById(R.id.name);
        holder.book_title=(TextView) rowView.findViewById(R.id.bookName);
        holder.content=(TextView) rowView.findViewById(R.id.content);
        holder.avatar=(ImageView) rowView.findViewById(R.id.avatar);
        holder.image=(ImageView) rowView.findViewById(R.id.image);
        holder.name.setText(posts.get(position).getUserId());
        holder.book_title.setText(posts.get(position).getBookName());
        holder.content.setText(posts.get(position).getContent());

        //new DownloadImageTask(holder.avatar).execute(posts.get(position));
        //new DownloadImageTask(holder.image).execute(posts.get(position).getImage());

        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+position, Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }
}
