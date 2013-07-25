package com.unrulymedia.techacadamy.di;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class VideoChartTest
{
    @Test
    public void testFacebookVideoChartTopShares() {
        VideoChart videoChart = new VideoChart();
        List<Video> topSharedFacebookVideos = videoChart.findFacebookVideos(ChartType.TOP_SHARES_CHART);

        assertNotNull(topSharedFacebookVideos);
        assertTrue(topSharedFacebookVideos.size() > 1);
    }

    @Test
    public void testFacebookVideoChartTopViewsAndShares() {
        VideoChart videoChart = new VideoChart();
        List<Video> topViewedAndSharedFacebookVideos = videoChart.findFacebookVideos(ChartType.ALL_CHARTS);

        assertNotNull(topViewedAndSharedFacebookVideos);
        assertTrue(topViewedAndSharedFacebookVideos.size() > 1);
    }

    @Test
    public void testTwitterVideoChartTopShares() {
        VideoChart videoChart = new VideoChart();
        List<Video> topSharedTwitterVideos = videoChart.findTwitterVideos(ChartType.TOP_SHARES_CHART);

        assertNotNull(topSharedTwitterVideos);
        assertTrue(topSharedTwitterVideos.size() > 1);
    }

    @Test
    public void testTwitterVideoChartTopViewsAndShares() {
        VideoChart videoChart = new VideoChart();
        List<Video> topViewedAndSharedTwitterVideos = videoChart.findTwitterVideos(ChartType.ALL_CHARTS);

        assertNotNull(topViewedAndSharedTwitterVideos);
        assertTrue(topViewedAndSharedTwitterVideos.size() > 1);
    }
}
