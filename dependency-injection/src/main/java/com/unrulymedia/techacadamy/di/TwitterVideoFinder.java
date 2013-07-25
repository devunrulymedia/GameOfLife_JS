package com.unrulymedia.techacadamy.di;

import java.util.Arrays;
import java.util.List;

public class TwitterVideoFinder {
    public List<Video> findVideosByTopShares() {
        System.out.println("Getting twitter videos with top shares....");
        Video video1 = new Video("twitterV1ref", "www.twitter.com/videos/twv1");
        Video video2 = new Video("twitterV2ref", "www.twitter.com/videos/twv2");
        Video video3 = new Video("twitterV3ref", "www.twitter.com/videos/twv3");

        return Arrays.asList(video1, video2, video3);
    }

    public List<Video> findVideosByTopViews() {
        System.out.println("Getting twitter videos with top views....");
        Video video1 = new Video("twitterV4ref", "www.twitter.com/videos/twv4");
        Video video2 = new Video("twitterV5ref", "www.twitter.com/videos/twv5");
        Video video3 = new Video("twitterV6ref", "www.twitter.com/videos/twv6");

        return Arrays.asList(video1, video2, video3);
    }

    public List<Video> findVideosByTopViewsAndShares() {
        System.out.println("Getting facebook videos with top views and shares....");
        Video video1 = new Video("twitterV1ref", "www.twitter.com/videos/twv1");
        Video video2 = new Video("twitterV2ref", "www.twitter.com/videos/twv2");
        Video video3 = new Video("twitterV3ref", "www.twitter.com/videos/twv3");
        Video video4 = new Video("twitterV4ref", "www.twitter.com/videos/twv4");
        Video video5 = new Video("twitterV5ref", "www.twitter.com/videos/twv5");
        Video video6 = new Video("twitterV6ref", "www.twitter.com/videos/twv6");

        return Arrays.asList(video1, video2, video3, video4, video5, video6);
    }
}
