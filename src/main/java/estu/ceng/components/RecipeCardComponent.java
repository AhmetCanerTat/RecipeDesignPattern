package estu.ceng.components;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.Ingredient;
import estu.ceng.modules.ratings.abstracts.Impact;

import java.util.ArrayList;

public class RecipeCardComponent {

    // This method is used to print the recipe card for modifying the recipe
    static void printRecipeCard(Recipe recipe, int recipeIndex) {
        Impact impact = (Impact) recipe.observers.get(0);
        System.out.println("##########################################################");
        System.out.println("#              Recipe No: " + recipeIndex +
                "\n# Recipe Name: " + recipe.getName() + " from the " + recipe.getType() + " Cuisine");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#   Rating : " + impact.displayAverage());
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  size " + recipe.getSize());
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Categories: " + recipe.getCategories());
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#        Tags: " + recipe.getTags());
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#                      Ingredients                       #");
        getIngredients(recipe);
        System.out.println("#                                                        #");
        getInstructions(recipe);
        System.out.println("##########################################################");
    }

    // This method is used for printing the recipe card in the search results
    public static void printRecipeCard(Recipe recipe) {
        Impact impact = (Impact) recipe.observers.get(0);
        System.out.println("##########################################################");
        System.out.println("#  " + recipe.getName() + " from the " + recipe.getType() + " Cuisine");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#   Rating : " + impact.displayAverage());
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Serve for " + recipe.getSize() + " people                  ");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Categories: " + recipe.getCategories());
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#        Tags: " + recipe.getTags());
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#                      Ingredients                       #");
        getIngredients(recipe);
        System.out.println("#                                                        #");
        getInstructions(recipe);
        System.out.println("##########################################################");
    }

    public static void printRecipeForAverageRating(Recipe recipe) {
        Impact impact = (Impact) recipe.observers.get(0);
        System.out.println("##########################################################");
        System.out.println("#  Recipe Name: " + recipe.getName() + "      Rate: " + impact.displayAverage() + "  #");
        System.out.println("##########################################################");
    }

    private static void getIngredients(Recipe recipe) {
        for (Ingredient ingredient : recipe.getIngredients()) {
            System.out.println("#                                                        #");
            System.out.println("# " + ingredient.getName() + " " + ingredient.getAmount() + " " + ingredient.getUnit());
        }
    }

    private static void getInstructions(Recipe recipe) {
        System.out.println("#                      Instructions                      #");
        ArrayList<String> instructions = recipe.getInstructions();
        for (int i = 0; i < instructions.size(); i++) {
            String instruction = instructions.get(i);
            System.out.println("#                                                        #");
            System.out.println("# " + (i + 1) + " -> " + instruction);
        }
    }
}
