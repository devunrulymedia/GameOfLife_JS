package com.unrulymedia.techacadamy.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VideoChart
{
    @Autowired FacebookVideoFinder facebookVideoFinder;
    @Autowired TwitterVideoFinder twitterVideoFinder;

    public static void main( String[] args )
    {
        System.out.println( "I'm a Video Chart" );

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-context.xml");
        VideoChart videoChart = applicationContext.getBean(VideoChart.class);
        videoChart.findFacebookVideos();
        videoChart.findTwitterVideos();
    }

    public VideoChart() {

    }

    public void findFacebookVideos() {
//        facebookVideoFinder = new FacebookVideoFinder();

        List<Video> facebookVideos = facebookVideoFinder.findVideosByTopShares();
        printVideoDetails(facebookVideos);

    }

    private void printVideoDetails(List<Video> videoList) {
        for(Video video: videoList) {
            System.out.println("----------------------------------");
            System.out.println("The Video Ref : "+ video.videoRef);
            System.out.println("The Video URL : "+ video.videoUrl);
        }
    }

    public void findTwitterVideos() {
//        twitterVideoFinder = new TwitterVideoFinder();
        List<Video> twitterVideos = twitterVideoFinder.findVideosByTopShares();
    }
}
