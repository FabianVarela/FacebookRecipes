package com.developer.fabian.facebookrecipes.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

@Entity
public class Recipe {

    @SerializedName("recipe_id")
    @PrimaryKey
    @NonNull
    private String recipeId;

    @ColumnInfo(name = "title")
    private String title;

    @SerializedName("image_url")
    @ColumnInfo(name = "image_url")
    private String imageUrl;

    @SerializedName("source_url")
    @ColumnInfo(name = "source_url")
    private String sourceUrl;

    @ColumnInfo(name = "favorite")
    private boolean favorite;

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public boolean equals(Object object) {
        boolean equal = false;

        if (object instanceof Recipe) {
            Recipe recipe = (Recipe) object;
            equal = this.recipeId.equals(recipe.getRecipeId());
        }

        return equal;
    }
}
