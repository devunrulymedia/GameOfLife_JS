package com.unrulymedia.techacadamy.di.config;

import com.google.inject.AbstractModule;
import com.google.inject.BindingAnnotation;
import com.unrulymedia.techacadamy.di.chart.VideoChart;
import com.unrulymedia.techacadamy.di.services.FacebookVideoFinder;
import com.unrulymedia.techacadamy.di.services.TwitterVideoFinder;
import com.unrulymedia.techacadamy.di.services.VideoFinder;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class VideoChartModule extends AbstractModule {

    @BindingAnnotation
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Facebook {}

    @BindingAnnotation
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Twitter {}

    @Override
    protected void configure() {
        bind(VideoFinder.class).annotatedWith(Facebook.class).toInstance(new FacebookVideoFinder());
        bind(VideoFinder.class).annotatedWith(Twitter.class).toInstance(new TwitterVideoFinder());
    }
}
