package com.unrulymedia.techacadamy.di;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FacebookVideoFinder {

    public List<Video> findVideosByTopShares() {
        Video video1 = new Video("v1ref", "www.facebook.com/videos/v1");
        Video video2 = new Video("v2ref", "www.facebook.com/videos/v2");
        Video video3 = new Video("v3ref", "www.facebook.com/videos/v3");

        return Arrays.asList(video1, video2, video3);
    }

}
