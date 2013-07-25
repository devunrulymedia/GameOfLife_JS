package com.unrulymedia.techacadamy.di.services.stub;

import com.unrulymedia.techacadamy.di.Video;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class FacebookVideoFinder {

    public List<Video> findVideosByTopShares() {
        System.out.println("Stub: Getting facebook videos with top shares....");
        Video video1 = new Video("v1ref", "www.facebook.com/videos/v1");

        return Arrays.asList(video1);
    }

    public List<Video> findVideosByTopViews() {
        System.out.println("Stub: Getting facebook videos with top views....");
        Video video2 = new Video("v2ref", "www.facebook.com/videos/v2");

        return Arrays.asList(video2);
    }

    public List<Video> findVideosByTopViewsAndShares() {
        System.out.println("Stub: Getting facebook videos with top views and shares....");
        Video video1 = new Video("v1ref", "www.facebook.com/videos/v1");
        Video video2 = new Video("v2ref", "www.facebook.com/videos/v2");

        return Arrays.asList(video1, video2);
    }

}
