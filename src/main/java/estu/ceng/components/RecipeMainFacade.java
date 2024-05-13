package estu.ceng.components;

public class RecipeMainFacade {

    private CreateRecipe createRecipe;
    private RecipeSearcher recipeSearcher;
    private ModifyRecipeComponent modifyRecipe;
    private RateRecipe rateRecipe;

    public RecipeMainFacade(CreateRecipe createRecipe, RecipeSearcher recipeSearcher,
            ModifyRecipeComponent modifyRecipe,
            RateRecipe rateRecipe) {
        this.createRecipe = createRecipe;
        this.recipeSearcher = recipeSearcher;
        this.modifyRecipe = modifyRecipe;
        this.rateRecipe = rateRecipe;
    }

    public void showMenu() {
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
                    createRecipe.recipeCreator();
                    break;

                case 2:
                    recipeSearcher.searchRecipe();
                    break;

                case 3:
                    modifyRecipe.handleModifyRecipe();
                    break;
                case 4:
                    rateRecipe.rateRecipe();
                    break;
                case 5:
                    RecipeLister.listAllRecipes();
                    break;
                case 6:
                    RecipeLister.listAllRecipesForAverageRatings();
                    RecipeLister.listAllRecipesForTotalRatings();
                    break;
                case 7:

                    System.out.println("Quitting the program...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }

        }

    }

}
