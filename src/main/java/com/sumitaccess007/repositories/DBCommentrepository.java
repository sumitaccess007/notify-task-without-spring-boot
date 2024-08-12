package com.sumitaccess007.repositories;

import com.sumitaccess007.model.Comment;

public class DBCommentrepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing Comment: " + comment.getText());
    }
}
