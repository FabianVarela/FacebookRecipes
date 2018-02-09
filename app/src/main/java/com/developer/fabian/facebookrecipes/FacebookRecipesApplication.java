package com.developer.fabian.facebookrecipes;

import android.app.Application;

import com.developer.fabian.facebookrecipes.DB.base.RecipesDatabase;
import com.facebook.FacebookSdk;

public class FacebookRecipesApplication extends Application {

    private static RecipesDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();

        initDatabase();
        initFacebookSdk();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    private void initDatabase() {
        database = RecipesDatabase.getInstance(this);
    }

    private void initFacebookSdk() {
        FacebookSdk.sdkInitialize(this);
    }
}
