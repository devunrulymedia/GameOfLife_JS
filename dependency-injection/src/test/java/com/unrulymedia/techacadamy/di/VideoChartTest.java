package com.unrulymedia.techacadamy.di;

import com.unrulymedia.techacadamy.di.chart.ChartType;
import com.unrulymedia.techacadamy.di.chart.VideoChart;
import org.junit.Test;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class VideoChartTest
{
    VideoChart videoChart;

    @Before
    public void setup() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test-app-context.xml");
        videoChart = applicationContext.getBean(VideoChart.class);
    }

    @Test
    public void testFacebookVideoChartTopShares() {
        List<Video> topSharedFacebookVideos = videoChart.findFacebookVideos(ChartType.TOP_SHARES_CHART);

        assertNotNull(topSharedFacebookVideos);
        assertTrue(topSharedFacebookVideos.size() == 1);
    }

    @Test
    public void testFacebookVideoChartTopViewsAndShares() {
        List<Video> topViewedAndSharedFacebookVideos = videoChart.findFacebookVideos(ChartType.ALL_CHARTS);

        assertNotNull(topViewedAndSharedFacebookVideos);
        assertTrue(topViewedAndSharedFacebookVideos.size() > 1);
    }

    @Test
    public void testTwitterVideoChartTopShares() {
        List<Video> topSharedTwitterVideos = videoChart.findTwitterVideos(ChartType.TOP_SHARES_CHART);

        assertNotNull(topSharedTwitterVideos);
        assertTrue(topSharedTwitterVideos.size() == 1);
    }

    @Test
    public void testTwitterVideoChartTopViewsAndShares() {
        List<Video> topViewedAndSharedTwitterVideos = videoChart.findTwitterVideos(ChartType.ALL_CHARTS);

        assertNotNull(topViewedAndSharedTwitterVideos);
        assertTrue(topViewedAndSharedTwitterVideos.size() > 1);
    }
}
