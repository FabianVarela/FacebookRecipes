package com.developer.fabian.facebookrecipes.DB.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.developer.fabian.facebookrecipes.entities.Recipe;

import java.util.List;

@Dao
public interface IRecipesDao {

    @Query("SELECT * FROM Recipe ORDER BY recipeId")
    List<Recipe> loadRecipes();

    @Insert
    void insertRecipes(Recipe recipe);

    @Query("DELETE FROM Recipe WHERE recipeId = :id")
    void deleteRecipe(String id);
}
