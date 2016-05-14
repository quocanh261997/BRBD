/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quanh.object;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author The
 */
public class Post {
    int postId;
    String userId;
    String bookName;
    int star;
    String content;
    String image;
    Date postTime;
    int mainPost; 
    
    public Post() {
    }

    public Post(int postId, String userId, String bookName, int star, String content, String image, Date postTime) {
        this.postId = postId;
        this.userId = userId;
        this.bookName = bookName;
        this.star = star;
        this.content = content;
        this.image = image;
        this.postTime = postTime;
    }

    public void setMainPost(int mainPost) {
        this.mainPost = mainPost;
    }

    public int getMainPost() {
        return mainPost;
    }

    public Post(int postId, String userId, String bookName, int star, String content, String image, Time postTime, int mainPost) {
        this.postId = postId;
        this.userId = userId;
        this.bookName = bookName;
        this.star = star;
        this.content = content;
        this.image = image;
        this.postTime = postTime;
        this.mainPost = mainPost;
    }

    public int getPostId() {
        return postId;
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public String getImage() {
        return image;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public String getBookName() {
        return bookName;
    }

    public int getStar() {
        return star;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }
    
}
