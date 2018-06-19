package com.developer.fabian.facebookrecipes.DB.base;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.developer.fabian.facebookrecipes.DB.dao.IRecipesDao;
import com.developer.fabian.facebookrecipes.entity.Recipe;

@Database(entities = {
        Recipe.class
}, version = 1, exportSchema = false)
public abstract class RecipesDatabase extends RoomDatabase {

    private static RecipesDatabase instance;

    public static RecipesDatabase getInstance(Context context) {
        if (instance == null)
            instance = Room.databaseBuilder(context, RecipesDatabase.class, "RecipesDB")
                    .fallbackToDestructiveMigration()
                    .build();

        return instance;
    }

    public abstract IRecipesDao recipesDao();
}
