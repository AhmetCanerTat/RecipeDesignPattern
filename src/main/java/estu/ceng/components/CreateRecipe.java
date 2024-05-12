package estu.ceng.components;

import java.util.List;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.Category;
import estu.ceng.entities.concrete.Ingredient;
import estu.ceng.entities.concrete.Size;
import estu.ceng.entities.concrete.Tag;
import estu.ceng.modules.creation.abstracts.RecipeFactory;

public class CreateRecipe {
    private static AddIngredient addIngredient;
    private static AddInstructions addInstructions;
    private static RecipeFactoryCreator recipeFactoryCreator;
    private static SizeSelector sizeSelector;
    private static CategorySelector categorySelector;
    private static TagSelector tagSelector;

    public  void recipeCreator() {
        RecipeFactory recipeFactory;
        System.out.println("===== Create Recipe =====");
        recipeFactory = getFactorySelector();
        System.out.println("Please enter the name of the recipe");
        String recipeName = System.console().readLine();
        Size size = getSizeSelector();
        Recipe recipe = recipeFactory.createRecipes(recipeName, size);
        recipeDetailAdder(recipe);
        System.out.println("Recipe created successfully");
    }

    public static void recipeDetailAdder(Recipe recipe) {
        recipe.addCategory(getCategorySelector());
        recipe.addTag(getTagSelector());
        recipe.setIngredients(getIngredientList());
        recipe.setInstructions(null);
    }

    public static Size getSizeSelector() {
        return sizeSelector.selectSize();
    }

    public static RecipeFactory getFactorySelector() {
        return recipeFactoryCreator.getRecipeStyle();
    }

    public static Category getCategorySelector() {
        return categorySelector.selectCategory();
    }

    public static Tag getTagSelector() {
        return tagSelector.selectTag();
    }

    public static List<Ingredient> getIngredientList() {
        return addIngredient.createIngredientList();
    }

    public static List<String> getInstructions() {
        return addInstructions.createInstructions();
    }
}
