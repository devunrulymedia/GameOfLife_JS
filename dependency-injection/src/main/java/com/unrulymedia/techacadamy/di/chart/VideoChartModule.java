package com.unrulymedia.techacadamy.di.chart;

import com.google.inject.AbstractModule;
import com.google.inject.BindingAnnotation;
import com.google.inject.Module;
import com.google.inject.Scopes;
import com.sun.xml.internal.ws.wsdl.writer.document.http.Binding;
import com.unrulymedia.techacadamy.di.services.FacebookVideoFinder;
import com.unrulymedia.techacadamy.di.services.TwitterVideoFinder;
import com.unrulymedia.techacadamy.di.services.VideoFinder;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created with IntelliJ IDEA.
 * User: bruce
 * Date: 26/07/13
 * Time: 13:01
 * To change this template use File | Settings | File Templates.
 */
public class VideoChartModule extends AbstractModule {
    @Override
    protected void configure() {
        //To change body of implemented methods use File | Settings | File Templates.

        bind(VideoFinder.class).annotatedWith(Facebook.class).to(FacebookVideoFinder.class).in(Scopes.SINGLETON);
        bind(VideoFinder.class).annotatedWith(Twitter.class).to(TwitterVideoFinder.class).in(Scopes.SINGLETON);

    }

    @BindingAnnotation
    @Retention(value= RetentionPolicy.RUNTIME)
    @interface Facebook {

    }

    @BindingAnnotation
    @Retention(value= RetentionPolicy.RUNTIME)
    @interface Twitter {

    }
}


