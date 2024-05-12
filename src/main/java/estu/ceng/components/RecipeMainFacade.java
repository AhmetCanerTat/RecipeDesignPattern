package estu.ceng.components;

import java.util.List;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.Category;
import estu.ceng.entities.concrete.Ingredient;
import estu.ceng.entities.concrete.Size;
import estu.ceng.entities.concrete.Tag;
import estu.ceng.modules.creation.abstracts.RecipeFactory;

public class RecipeMainFacade {
    private static RecipeFactoryCreator recipeFactoryCreator;
    private static SizeSelector sizeSelector;
    private static CategorySelector categorySelector;
    private static TagSelector tagSelector;
    private static AddIngredient addIngredient;
    private static AddInstructions addInstructions;

    RecipeMainFacade() {
        recipeFactoryCreator = new RecipeFactoryCreator();
        sizeSelector = new SizeSelector();
        categorySelector = new CategorySelector();
        tagSelector = new TagSelector();
        addIngredient = new AddIngredient();
        addInstructions = new AddInstructions();
    }

    public static void showMenu() {
        boolean exit = false;
        while (!exit) {

            System.out.println("=== Menu ===");
            System.out.println("1. Create Recipe");
            System.out.println("2. Search Recipe");
            System.out.println("3. Modify Recipe");
            System.out.println("4. Rate Recipe");
            System.out.println("5. List All Recipes");
            System.out.println("6. Show Ratings");
            System.out.println("7. Exit");
            System.out.println("============");
            System.out.println("Enter your choice: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(System.console().readLine());
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }

            switch (choice) {
                case 1:
                    CreateRecipe();
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }

            break;

        }

    }

    private static void CreateRecipe() {
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
