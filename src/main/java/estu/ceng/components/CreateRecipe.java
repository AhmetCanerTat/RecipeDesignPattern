package estu.ceng.components;

import java.util.List;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.Category;
import estu.ceng.entities.concrete.Ingredient;
import estu.ceng.entities.concrete.Size;
import estu.ceng.entities.concrete.Tag;
import estu.ceng.modules.creation.abstracts.RecipeFactory;
import estu.ceng.modules.ratings.abstracts.Impact;

public class CreateRecipe {
    private AddIngredient addIngredient;
    private AddInstructions addInstructions;
    private RecipeFactoryCreator recipeFactoryCreator;
    private SizeSelector sizeSelector;
    private CategorySelector categorySelector;
    private TagSelector tagSelector;

    public CreateRecipe(AddIngredient addIngredient, AddInstructions addInstructions,
            RecipeFactoryCreator recipeFactoryCreator, SizeSelector sizeSelector, CategorySelector categorySelector,
            TagSelector tagSelector) {
        this.addIngredient = addIngredient;
        this.addInstructions = addInstructions;
        this.recipeFactoryCreator = recipeFactoryCreator;
        this.sizeSelector = sizeSelector;
        this.categorySelector = categorySelector;
        this.tagSelector = tagSelector;
    }

    public void recipeCreator() {
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

    public void recipeDetailAdder(Recipe recipe) {
        recipe.registerObserver(new Impact());
        recipe.addCategory(getCategorySelector());
        recipe.addTag(getTagSelector());
        recipe.setIngredients(getIngredientList());
        
        recipe.setInstructions(addInstructions.createInstructions());
    }

    public Size getSizeSelector() {
        return sizeSelector.selectSize();
    }

    public RecipeFactory getFactorySelector() {
        return recipeFactoryCreator.getRecipeStyle();
    }

    public Category getCategorySelector() {
        return categorySelector.selectCategory();
    }

    public Tag getTagSelector() {
        return tagSelector.selectTag();
    }

    public List<Ingredient> getIngredientList() {
        return addIngredient.createIngredientList();
    }

    public List<String> getInstructions() {
        return addInstructions.createInstructions();
    }
}
