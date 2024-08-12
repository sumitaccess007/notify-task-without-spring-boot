package com.sumitaccess007.main;

import com.sumitaccess007.model.Comment;
import com.sumitaccess007.proxies.EmailCommentNotificationProxy;
import com.sumitaccess007.repositories.DBCommentrepository;
import com.sumitaccess007.services.CommentService;

public class NotifyTaskMain {
    public static void main(String[] args) {
        // Create the instance for the dependencies
        var commentRepository = new DBCommentrepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        // Create the instance of service class and provide the dependencies
        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        // Create an instance of the Comment to send as a parameter to the publish comment use case
        var comment = new Comment();
        comment.setText("Project: Notify Task without using spring framework");
        comment.setAuthor("Sumit SHARMA");

        // Call the publish comment use case
        commentService.publishComment(comment);
    }
}
