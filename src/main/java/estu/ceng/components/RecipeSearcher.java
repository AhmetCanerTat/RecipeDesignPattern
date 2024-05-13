package estu.ceng.components;

import estu.ceng.entities.concrete.Category;
import estu.ceng.entities.concrete.Tag;
import estu.ceng.modules.search.SearchRecipe;

public class RecipeSearcher {
    private  SearchRecipe searchRecipe;
    private  CategorySelector categorySelector;
    private  TagSelector tagSelector;

    public RecipeSearcher() {
        searchRecipe = new SearchRecipe();
        categorySelector = new CategorySelector();
        tagSelector = new TagSelector();
    }

    public  void searchRecipe() {
        System.out.println("===== Search Recipe =====");
        System.out.println("|   1. Search Recipe By Name                   |");
        System.out.println("|   2. Search Recipe By Category               |");
        System.out.println("|   3. Search Recipe By Ingredient             |");
        System.out.println("|   4. Search Recipe By Tag                    |");
        System.out.println("=========================");

        System.out.print("Enter your choice: ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
                return;
            }
        }
        switch (choice) {
            case 1:
                System.out.println("Enter the name of the recipe");
                String name = System.console().readLine();
                searchRecipe.searchRecipeByName(name);
                System.out.println("=========================");
                break;
            case 2:
                Category category = categorySelector.selectCategory();
                searchRecipe.searchRecipeByCategory(category);
                System.out.println("=========================");
                break;
            case 3:
                System.out.println("********** Search Recipe By Ingredient **********");
                System.out.println("Enter ingredient name: ");
                name = System.console().readLine();
                searchRecipe.searchRecipeByIngredient(name);
                System.out.println("=========================");
                break;
            case 4:
                Tag tag = tagSelector.selectTag();
                searchRecipe.searchRecipeByTag(tag);
                System.out.println("=========================");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                break;
        }

    }

}
