package com.sumitaccess007.model;

public class Comment {
    private String text;
    private String author;

    public Comment() {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
