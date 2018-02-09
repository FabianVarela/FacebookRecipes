package com.developer.fabian.facebookrecipes.libs.DI;

import android.app.Activity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.developer.fabian.facebookrecipes.libs.eventbus.IEventBus;
import com.developer.fabian.facebookrecipes.libs.eventbus.RobotEventBus;
import com.developer.fabian.facebookrecipes.libs.glide.IImageLoader;
import com.developer.fabian.facebookrecipes.libs.glide.ImageLoader;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LibsModule {

    private Activity activity;

    public LibsModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @Singleton
    IImageLoader provideImagesLoader(RequestManager requestManager) {
        return new ImageLoader(requestManager);
    }

    @Provides
    @Singleton
    RequestManager provideRequestManager(Activity activity) {
        return Glide.with(activity);
    }

    @Provides
    @Singleton
    Activity providesActivity() {
        return this.activity;
    }

    @Provides
    @Singleton
    IEventBus provideEventBus(EventBus eventBus) {
        return new RobotEventBus(eventBus);
    }

    @Provides
    @Singleton
    EventBus providesLibraryEventBus() {
        return EventBus.getDefault();
    }
}
