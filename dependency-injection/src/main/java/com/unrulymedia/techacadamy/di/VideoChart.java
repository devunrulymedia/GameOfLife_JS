package com.unrulymedia.techacadamy.di;

import java.util.List;

public class VideoChart
{
    public static void main( String[] args )
    {
        System.out.println( "I'm a Video Chart" );
    }

    public void findFacebookVideos() {
        FacebookVideoFinder facebookVideoFinder = new FacebookVideoFinder();
        List<Video> facebooVideos = facebookVideoFinder.findViedosByTopShares();

    }

    public void findTwitterVideos() {
        TwitterVideoFinder twitterVideoFinder = new TwitterVideoFinder();
        List<Video> twitterVideos = twitterVideoFinder.findViedosByTopShares();
    }
}
