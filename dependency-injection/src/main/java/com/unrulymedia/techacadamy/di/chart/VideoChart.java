package com.unrulymedia.techacadamy.di.chart;

import com.unrulymedia.techacadamy.di.Video;
import com.unrulymedia.techacadamy.di.chart.ChartType;
import com.unrulymedia.techacadamy.di.services.FacebookVideoFinder;
import com.unrulymedia.techacadamy.di.services.TwitterVideoFinder;

import java.util.List;

public class VideoChart
{
    FacebookVideoFinder facebookVideoFinder;
    TwitterVideoFinder twitterVideoFinder;

    public static void main( String[] args )
    {
        VideoChart videoChart = new VideoChart();
        System.out.println(">>>>>>>> Charts for top views");
        printVideoDetails(videoChart.findFacebookVideos(ChartType.TOP_VIEWS_CHART));
        printVideoDetails(videoChart.findTwitterVideos(ChartType.TOP_VIEWS_CHART));

        System.out.println(">>>>>>>>> Charts for top shares");
        printVideoDetails(videoChart.findFacebookVideos(ChartType.TOP_SHARES_CHART));
        printVideoDetails(videoChart.findTwitterVideos(ChartType.TOP_SHARES_CHART));
    }

    public List<Video> findFacebookVideos(ChartType chartType) {
        facebookVideoFinder = new FacebookVideoFinder();

        if(ChartType.TOP_SHARES_CHART.equals(chartType)) {
            return facebookVideoFinder.findVideosByTopShares();
        } else if(ChartType.TOP_VIEWS_CHART.equals(chartType)) {
            return facebookVideoFinder.findVideosByTopViews();
        } else {
            return facebookVideoFinder.findVideosByTopViewsAndShares();
        }

    }

    public List<Video> findTwitterVideos(ChartType chartType) {
        twitterVideoFinder = new TwitterVideoFinder();

        if(ChartType.TOP_SHARES_CHART.equals(chartType)) {
            return twitterVideoFinder.findVideosByTopShares();
        } else if(ChartType.TOP_VIEWS_CHART.equals(chartType)) {
            return twitterVideoFinder.findVideosByTopViews();
        } else {
            return twitterVideoFinder.findVideosByTopViewsAndShares();
        }
    }


    private static void printVideoDetails(List<Video> videoList) {
        for(Video video: videoList) {
            System.out.println("----------------------------------");
            System.out.println("The Video Ref : "+ video.videoRef);
            System.out.println("The Video URL : "+ video.videoUrl);
        }
    }
}
