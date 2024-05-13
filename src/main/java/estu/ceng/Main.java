package estu.ceng;

import estu.ceng.components.AddIngredient;
import estu.ceng.components.AddInstructions;
import estu.ceng.components.CategorySelector;
import estu.ceng.components.CreateRecipe;
import estu.ceng.components.ModifyRecipeComponent;
import estu.ceng.components.RateRecipe;
import estu.ceng.components.RecipeFactoryCreator;
import estu.ceng.components.RecipeMainFacade;
import estu.ceng.components.RecipeSearcher;
import estu.ceng.components.SizeSelector;
import estu.ceng.components.TagSelector;

/**
 * Hello world!
 *
 */
public class Main {

    private static RecipeMainFacade recipeMainFacade;

    public static void main(String[] args) {

        recipeMainFacade = new RecipeMainFacade(
                new CreateRecipe(new AddIngredient(), new AddInstructions(), new RecipeFactoryCreator(),
                        new SizeSelector(), new CategorySelector(), new TagSelector()),
                new RecipeSearcher(), new ModifyRecipeComponent(),
                new RateRecipe());
        recipeMainFacade.showMenu();

    }
}
