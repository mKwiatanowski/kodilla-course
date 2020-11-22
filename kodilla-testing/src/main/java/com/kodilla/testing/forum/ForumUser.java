package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {

    private String name;
    private String realName;
    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String postBody, String autor){
        ForumPost thePost = new ForumPost(postBody, autor);
        posts.add(thePost);

    }

    public void addComment(ForumPost thePost, String commentBody, String autor){
        ForumComment theComment = new ForumComment(thePost, commentBody, autor);
        comments.add(theComment);

    }

    public int getCommentQuantity(){
        return comments.size();
    }

    public int getPostQuantity(){
        return posts.size();
    }

    public ForumPost getPost(int postNumber){
        if(postNumber >= 0 && postNumber < posts.size()){
            return posts.get(postNumber);
        }
        return null;
    }

    public ForumComment getComment(int commentNumber){
        ForumComment theCommit = null;
        if(commentNumber >= 0 && commentNumber < comments.size()){
            theCommit = comments.get(commentNumber);
        }
        return theCommit;
    }

    public boolean removePost(ForumPost thePost) {
        boolean result = false;
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment) {
        boolean result = false;
        if (comments.contains(theComment)) {
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

}
