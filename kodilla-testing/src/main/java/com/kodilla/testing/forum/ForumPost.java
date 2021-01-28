package com.kodilla.testing.forum;

public class ForumPost {

    private String postBody;
    private String autor;

    public ForumPost(String postBody, String autor){
        this.autor = autor;
        this.postBody = postBody;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPost forumPost = (ForumPost) o;

        if (!postBody.equals(forumPost.postBody)) return false;
        return autor.equals(forumPost.autor);
    }

    @Override
    public int hashCode() {
        int result = postBody.hashCode();
        result = 31 * result + autor.hashCode();
        return result;
    }
}
