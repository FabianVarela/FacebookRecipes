package com.developer.fabian.facebookrecipes.api.classes;

import com.developer.fabian.facebookrecipes.api.interfaces.IRecipeService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RecipeClient {

    private static final String BASE_URL = "http://food2fork.com/api/";

    private Retrofit retrofit;

    public RecipeClient() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public IRecipeService getRecipeService() {
        return this.retrofit.create(IRecipeService.class);
    }
}
