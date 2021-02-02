package om.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.ZGeneration;
import com.kodilla.patterns.strategy.social.socialMedia.FacebookPublisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User ben = new Millenials("Ben");
        User john = new YGeneration("John");
        User matt = new ZGeneration("Matt");

        //When
        String benMedia = ben.sharePost();
        String johnMedia = john.sharePost();
        String mattMedia = matt.sharePost();

        //Then
        Assertions.assertEquals("Twitter", benMedia);
        System.out.println(ben.getUserName() + " is a user " + benMedia);
        Assertions.assertEquals("Facebook", johnMedia);
        System.out.println(ben.getUserName() + " is a user " + johnMedia);
        Assertions.assertEquals("Snapchat", mattMedia);
        System.out.println(ben.getUserName() + " is a user " + mattMedia);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User ben = new Millenials("Ben");

        //When
        System.out.println("Before");
        String benMedia = ben.sharePost();
        System.out.println(ben.getUserName() + " is a user " + benMedia);

        System.out.println("Now");
        ben.setSocialPublisher(new FacebookPublisher());
        benMedia = ben.sharePost();
        System.out.println(ben.getUserName() + " is a user " + benMedia);

        //Then
        Assertions.assertEquals("Facebook", benMedia);

    }
}
