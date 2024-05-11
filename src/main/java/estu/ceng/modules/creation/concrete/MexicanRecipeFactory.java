package estu.ceng.modules.creation.concrete;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.MexicanRecipe;
import estu.ceng.entities.concrete.Size;
import estu.ceng.modules.creation.abstracts.RecipeFactory;
import estu.ceng.modules.singleton.RecipeBookSingleton;

public class MexicanRecipeFactory extends RecipeFactory {

    Recipe recipe;
    public MexicanRecipeFactory() {
        super();
        System.out.println("Created Mexican Recipe Factory");
    }


    @Override
    public Recipe createRecipes(String name, Size servingSize) {
        recipe = new MexicanRecipe(name, servingSize);
        RecipeBookSingleton.getInstance().addRecipe(recipe);
        return recipe;    }
}
