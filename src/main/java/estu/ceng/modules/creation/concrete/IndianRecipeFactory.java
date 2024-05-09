package estu.ceng.modules.creation.concrete;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.IndianRecipe;
import estu.ceng.modules.creation.abstracts.RecipeFactory;
import estu.ceng.modules.singleton.RecipeBookSingleton;

public class IndianRecipeFactory extends RecipeFactory {
    Recipe recipe;
    public IndianRecipeFactory() {
        super();
        System.out.println("Created Indian Recipe Factory");
    }
    @Override
    public Recipe createRecipes(String name, String servingSize) {
        recipe = new IndianRecipe(name, servingSize);
        RecipeBookSingleton.getInstance().addRecipe(recipe);
        return recipe;
    }
}
