/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quanh.object;

/**
 *
 * @author The
 */
public class Book {
    String bookName;
    String cover;
    String author;
    int releaseDate;

    public Book(String bookName, String cover, String author, int releaseDate) {
        this.bookName = bookName;
        this.cover = cover;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public String getCover() {
        return cover;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
    
}
