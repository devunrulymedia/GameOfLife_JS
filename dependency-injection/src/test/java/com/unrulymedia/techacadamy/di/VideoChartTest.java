package com.unrulymedia.techacadamy.di;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unrulymedia.techacadamy.di.chart.ChartType;
import com.unrulymedia.techacadamy.di.chart.VideoChart;
import com.unrulymedia.techacadamy.di.chart.VideoChartModule;
import com.unrulymedia.techacadamy.di.chart.VideoChartModule.*;
import com.unrulymedia.techacadamy.di.services.FacebookVideoFinder;
import com.unrulymedia.techacadamy.di.services.TwitterVideoFinder;
import com.unrulymedia.techacadamy.di.services.VideoFinder;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class VideoChartTest
{
    @Inject
    private VideoChart videoChart;

    private VideoFinder fbFinder = new FacebookVideoFinder();
    private VideoFinder tFinder = new TwitterVideoFinder();

    @Before
    public void setUp() {
        Injector injector = Guice.createInjector(new VideoChartModule()
        );
        injector.injectMembers(this);
    }

    @Test
    public void testFacebookVideoChartTopShares() {
        List<Video> topSharedFacebookVideos = videoChart.findFacebookVideos(ChartType.TOP_SHARES_CHART);

        assertNotNull(topSharedFacebookVideos);
        assertTrue(topSharedFacebookVideos.size() > 1);
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
        assertTrue(topSharedTwitterVideos.size() > 1);
    }

    @Test
    public void testTwitterVideoChartTopViewsAndShares() {
        List<Video> topViewedAndSharedTwitterVideos = videoChart.findTwitterVideos(ChartType.ALL_CHARTS);

        assertNotNull(topViewedAndSharedTwitterVideos);
        assertTrue(topViewedAndSharedTwitterVideos.size() > 1);
    }
}
