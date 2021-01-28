package com.kodilla.testing.forum;

public class ForumComment {

    private ForumPost forumPost;
    private String commentBody;
    private String autor;

    public ForumComment(ForumPost forumPost, String commentBody, String autor){
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.autor = autor;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumComment that = (ForumComment) o;

        if (!forumPost.equals(that.forumPost)) return false;
        if (!commentBody.equals(that.commentBody)) return false;
        return autor.equals(that.autor);
    }

    @Override
    public int hashCode() {
        int result = forumPost.hashCode();
        result = 31 * result + commentBody.hashCode();
        result = 31 * result + autor.hashCode();
        return result;
    }
}
