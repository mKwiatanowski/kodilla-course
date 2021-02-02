package com.kodilla.patterns.strategy.social.socialMedia;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {

    public String share(){
        return "Facebook";
    }
}
