package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suit: begin");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suit: end");
    }


    @DisplayName("when create SimpleUser with realName, " +
                 "then getRealName should return real user name"
    )

    @Test
    void testCaseRealName(){
        //Giben
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("John Smith", result);
    }

    @DisplayName("when create SimpleUser with name, " +
            "then getUsername should return correct name"
    )

    @Test
    void testCaseUserName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String expectedResult = "theForumUser";
        //When
        String result = simpleUser.getUserName();
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
