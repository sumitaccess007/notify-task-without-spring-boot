package com.sumitaccess007.proxies;

import com.sumitaccess007.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
