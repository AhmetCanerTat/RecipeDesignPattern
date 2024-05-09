package estu.ceng.modules.creation.concrete;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.WesternRecipe;
import estu.ceng.modules.creation.abstracts.RecipeFactory;
import estu.ceng.modules.singleton.RecipeBookSingleton;

public class WesternRecipeFactory extends RecipeFactory {
    Recipe recipe;
    public WesternRecipeFactory() {
        super();
        System.out.println("Created Western Recipe Factory");
    }


    @Override
    public Recipe createRecipes(String name, String servingSize) {
        recipe = new WesternRecipe(name, servingSize);
        RecipeBookSingleton.getInstance().addRecipe(recipe);
        return recipe;
    }
}
