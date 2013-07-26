package com.unrulymedia.techacadamy.di.services;

import com.unrulymedia.techacadamy.di.Video;

import java.util.List;


public interface VideoFinder {
    List<Video> findVideosByTopShares();

    List<Video> findVideosByTopViews();

    List<Video> findVideosByTopViewsAndShares();
}
