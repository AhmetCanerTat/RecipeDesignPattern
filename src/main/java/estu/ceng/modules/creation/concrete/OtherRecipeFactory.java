package estu.ceng.modules.creation.concrete;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.OtherRecipe;
import estu.ceng.entities.concrete.Size;
import estu.ceng.entities.concrete.WesternRecipe;
import estu.ceng.modules.creation.abstracts.RecipeFactory;
import estu.ceng.modules.singleton.RecipeBookSingleton;

public class OtherRecipeFactory extends RecipeFactory {
    Recipe recipe;
    String name;
    public OtherRecipeFactory(String name) {
        super();
        this.name = name;
        System.out.println("Creating " + name + " Recipe Factory");
    }



    @Override
    public Recipe createRecipes(String name, Size servingSize) {
        recipe = new WesternRecipe(name, servingSize);
        RecipeBookSingleton.getInstance().addRecipe(recipe);
        return recipe;
    }
}
