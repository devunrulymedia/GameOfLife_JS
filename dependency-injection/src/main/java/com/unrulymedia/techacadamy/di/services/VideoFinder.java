package com.unrulymedia.techacadamy.di.services;

import com.unrulymedia.techacadamy.di.Video;

import java.util.List;

public interface VideoFinder {

    public List<Video> findVideosByTopShares();

    public List<Video> findVideosByTopViews();

    public List<Video> findVideosByTopViewsAndShares();
}
