package com.example.a139186_138513

import androidx.lifecycle.LiveData

class RecipeRepository<RecipeDao>(private val recipeDao: RecipeDao) {

    val allRecipes: LiveData<List<Recipe>> = recipeDao.getAllRecipes()

    suspend fun insert(recipe: Recipe) {
        recipeDao.insert(recipe)
    }
}
