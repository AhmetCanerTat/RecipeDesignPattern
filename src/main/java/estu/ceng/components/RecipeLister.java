package estu.ceng.components;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.modules.ratings.abstracts.Observer;
import estu.ceng.modules.singleton.RecipeBookSingleton;

import java.util.List;

public class RecipeLister {

    static RecipeBookSingleton recipeBookSingleton = RecipeBookSingleton.getInstance();

    public static void listAllRecipes() {
        List<Recipe> recipeList = recipeBookSingleton.getRecipeList();
        Recipe recipe;
        for (int i = 0; i < recipeList.size(); i++) {
            recipe = recipeList.get(i);
            RecipeCardComponent.printRecipeCard(recipe, i);
        }
    }

    public static void listAllRecipesForAverageRatings() {
        List<Recipe> recipeList = recipeBookSingleton.getRecipeList();
        Recipe recipe;
        for (int i = 0; i < recipeList.size(); i++) {
            recipe = recipeList.get(i);

            RecipeCardComponent.printRecipeForAverageRating(recipe);
        }
    }

    public static void listAllRecipesForTotalRatings() {
        List<Recipe> recipeList = recipeBookSingleton.getRecipeList();
        Recipe recipe;
        for (int i = 0; i < recipeList.size(); i++) {
            recipe = recipeList.get(i);
            RecipeCardComponent.printRecipeForAverageRating(recipe);
        }
    }

}