package com.unrulymedia.techacadamy.di;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class TwitterVideoFinder {
    public List<Video> findVideosByTopShares() {
        Video video1 = new Video("twitterv1ref", "www.twitter.com/videos/twv1");
        Video video2 = new Video("twitterv2ref", "www.twitter.com/videos/twv2");
        Video video3 = new Video("twitterv3ref", "www.twitter.com/videos/twv3");

        return Arrays.asList(video1, video2, video3);
    }

}
