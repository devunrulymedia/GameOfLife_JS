package com.unrulymedia.techacadamy.di.services.stub;

import com.unrulymedia.techacadamy.di.Video;
import com.unrulymedia.techacadamy.di.services.VideoFinder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TwitterVideoFinder implements VideoFinder {
    public List<Video> findVideosByTopShares() {
        System.out.println("Stub: Getting twitter videos with top shares....");
        Video video1 = new Video("twitterV1ref", "www.twitter.com/videos/twv1");

        return Arrays.asList(video1);
    }

    public List<Video> findVideosByTopViews() {
        System.out.println("Stub: Getting twitter videos with top views....");
        Video video2 = new Video("twitterV2ref", "www.twitter.com/videos/twv2");

        return Arrays.asList(video2);
    }

    public List<Video> findVideosByTopViewsAndShares() {
        System.out.println("Stub: Getting twitter videos with top views and shares....");
        Video video1 = new Video("twitterV1ref", "www.twitter.com/videos/twv1");
        Video video2 = new Video("twitterV2ref", "www.twitter.com/videos/twv2");

        return Arrays.asList(video1, video2);
    }
}
