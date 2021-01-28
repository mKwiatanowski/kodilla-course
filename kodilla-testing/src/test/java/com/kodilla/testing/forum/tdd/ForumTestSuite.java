package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

import java.net.Authenticator;

@DisplayName("TDD Forum test suite")
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void berofeAllTests() {

        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAkkTests() {
        System.out.println("This test are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for posts")
    class ThePosts {
        @Test
        void testAddPost() {

            //Given
            ForumUser forumUser = new ForumUser("jacek12", "Jacek Kowalski");
            //When
            forumUser.addPost("Hello everyone, this is my first contribution here!", "jacek12");
            //Then
            Assertions.assertEquals(1, forumUser.getPostQuantity());
        }


        @Test
        void testGetPost() {
            //Given
            ForumUser forumUser = new ForumUser("jacek12", "Jacek Kowalski");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "jacek12");
            forumUser.addPost(thePost.getPostBody(), thePost.getAutor());
            //When
            ForumPost retrievedPost;
            retrievedPost = forumUser.getPost(0);
            //Then
            Assertions.assertEquals(thePost, retrievedPost);

        }

        @Test
        void testRemotePostNotExisiting() {
            //Given
            ForumUser forumUser = new ForumUser("jacek12", "Jacek Kowalski");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "jacek12");
            //When
            boolean result = forumUser.removePost(thePost);
            //Then
            Assertions.assertFalse(result);

        }

        @Test
        void testRemovePost(){
            //Given
            ForumUser forumUser = new ForumUser("jacek12", "Jacek Kowalski");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "jacek12");
            forumUser.addPost(thePost.getPostBody(), thePost.getAutor());
            //When
            boolean result = forumUser.removePost(thePost);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0,forumUser.getPostQuantity());
        }


    }

    @Nested
    @DisplayName("Tests for comment")
    class TheComment {
        @Test
        void testAddComment() {
            //Given
            ForumUser forumUser = new ForumUser("jacek12", "Jacek Kowalski");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "jacek12");
            //When
            forumUser.addComment(thePost, "Thank you for all good words!", "jacek12");
            //Then
            Assertions.assertEquals(1, forumUser.getCommentQuantity());
        }


        @Test
        void testGetComment() {
            //Given
            ForumUser forumUser = new ForumUser("jacek12", "Jacek Kowalski");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "jacek12");
            ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "jacek12");
            forumUser.addComment(thePost, theComment.getCommentBody(), theComment.getAutor());
            //When
            ForumComment retrievedComment = forumUser.getComment(0);
            //Then
            Assertions.assertEquals(theComment, retrievedComment);

        }

        @Test
        void testRemoteCommentNotExisiting() {
            //Given
            ForumUser forumUser = new ForumUser("jacek12", "Jacek Kowalski");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "jacek12");
            ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "jacek12");
            //When
            boolean result = forumUser.removeComment(theComment);
            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveComment(){
            //Given
            ForumUser forumUser = new ForumUser("jacek12", "Jacek Kowalski");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "jacek12");
            ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "jacek12");
            forumUser.addComment(thePost, theComment.getCommentBody(), theComment.getAutor());
            //When
            boolean result = forumUser.removeComment(theComment);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0,forumUser.getCommentQuantity());
        }

    }

}

