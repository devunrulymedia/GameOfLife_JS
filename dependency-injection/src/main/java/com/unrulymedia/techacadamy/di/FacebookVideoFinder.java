package com.unrulymedia.techacadamy.di;

import java.util.Arrays;
import java.util.List;

public class FacebookVideoFinder {

    public List<Video> findVideosByTopShares() {
        System.out.println("Getting facebook videos with top shares....");
        Video video1 = new Video("v1ref", "www.facebook.com/videos/v1");
        Video video2 = new Video("v2ref", "www.facebook.com/videos/v2");
        Video video3 = new Video("v3ref", "www.facebook.com/videos/v3");

        return Arrays.asList(video1, video2, video3);
    }

    public List<Video> findVideosByTopViews() {
        System.out.println("Getting facebook videos with top views....");
        Video video1 = new Video("v4ref", "www.facebook.com/videos/v4");
        Video video2 = new Video("v5ref", "www.facebook.com/videos/v5");
        Video video3 = new Video("v6ref", "www.facebook.com/videos/v6");

        return Arrays.asList(video1, video2, video3);
    }

    public List<Video> findVideosByTopViewsAndShares() {
        System.out.println("Getting facebook videos with top views and shares....");
        Video video1 = new Video("v1ref", "www.facebook.com/videos/v1");
        Video video2 = new Video("v2ref", "www.facebook.com/videos/v2");
        Video video3 = new Video("v3ref", "www.facebook.com/videos/v3");
        Video video4 = new Video("v4ref", "www.facebook.com/videos/v4");
        Video video5 = new Video("v5ref", "www.facebook.com/videos/v5");
        Video video6 = new Video("v6ref", "www.facebook.com/videos/v6");

        return Arrays.asList(video1, video2, video3, video4, video5, video6);
    }
}
