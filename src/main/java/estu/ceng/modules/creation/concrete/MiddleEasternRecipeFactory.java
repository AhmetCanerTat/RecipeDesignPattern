package estu.ceng.modules.creation.concrete;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.MiddleEasternRecipe;
import estu.ceng.modules.creation.abstracts.RecipeFactory;
import estu.ceng.modules.singleton.RecipeBookSingleton;

public class MiddleEasternRecipeFactory extends RecipeFactory {
    Recipe recipe;
    public MiddleEasternRecipeFactory() {
        super();
        System.out.println("Created Middle Eastern Recipe Factory");
    }

    @Override
    public Recipe createRecipes(String name, String servingSize) {
        recipe = new MiddleEasternRecipe(name, servingSize);
        RecipeBookSingleton.getInstance().addRecipe(recipe);
        return recipe;    }
}
