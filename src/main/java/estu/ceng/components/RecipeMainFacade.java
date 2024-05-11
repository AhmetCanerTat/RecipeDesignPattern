package estu.ceng.components;

import estu.ceng.modules.creation.abstracts.RecipeFactory;

public class RecipeMainFacade {
    private RecipeFactoryCreator recipeFactoryCreator;

    RecipeMainFacade() {
        recipeFactoryCreator = new RecipeFactoryCreator();
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

    }

    public RecipeFactory getRecipeFactory() {
        return recipeFactoryCreator.getRecipeStyle();
    }
}
