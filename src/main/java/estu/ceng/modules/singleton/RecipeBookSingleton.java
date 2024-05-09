package estu.ceng.modules.singleton;

import estu.ceng.entities.abstracts.Recipe;

import java.util.LinkedList;
import java.util.List;

public class RecipeBookSingleton {
    private static RecipeBookSingleton instance;
    private final List<Recipe> recipeList = new LinkedList<>();

    private RecipeBookSingleton() {
    }

    public static synchronized RecipeBookSingleton getInstance() {
        if (instance == null) {
            instance = new RecipeBookSingleton();
        }
        return instance;
    }

    // add recipe to recipe list
    public synchronized void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }

    // remove recipe from recipe list
    public synchronized void removeRecipe(Recipe recipe) {
        recipeList.remove(recipe);
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }
}
