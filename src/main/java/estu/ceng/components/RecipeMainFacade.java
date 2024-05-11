package estu.ceng.components;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.Size;
import estu.ceng.modules.creation.abstracts.RecipeFactory;

public class RecipeMainFacade {
    private RecipeFactoryCreator recipeFactoryCreator;
    private SizeSelector sizeSelector;

    RecipeMainFacade() {
        recipeFactoryCreator = new RecipeFactoryCreator();
        sizeSelector = new SizeSelector();
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

    private void CreateRecipe() {
        RecipeFactory recipeFactory;
        System.out.println("===== Create Recipe =====");
        recipeFactory = getRecipeFactory();
        System.out.println("Please enter the name of the recipe");
        String recipeName = System.console().readLine();
        Size size = getSize();
        Recipe recipe = recipeFactory.createRecipes(recipeName, size);

    }

    public Size getSize() {
        return sizeSelector.selectSize();
    }

    public RecipeFactory getRecipeFactory() {
        return recipeFactoryCreator.getRecipeStyle();
    }
}
