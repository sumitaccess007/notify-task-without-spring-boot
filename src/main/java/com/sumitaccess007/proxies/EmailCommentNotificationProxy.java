package com.sumitaccess007.proxies;

import com.sumitaccess007.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending notifiaction for comment: " + comment.getText()
                + " written by " + comment.getAuthor());
    }
}
