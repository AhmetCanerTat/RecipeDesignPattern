package estu.ceng.components;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.modules.ratings.abstracts.Observer;
import estu.ceng.modules.ratings.abstracts.Subject;

public class RateRecipe {

  

    public void rateRecipe() {
        System.out.println("=========== Rate Recipe ===========");
        Recipe recipe = SelectRecipeComponent.selectRecipe();
        System.out.println("============================");

        System.out.println("Enter your rating (0-5): ");

        int rating;
        while (true) {
            try {
                rating = Integer.parseInt(System.console().readLine());
                if (rating < 0 || rating > 5)
                    System.out.println("Invalid rating, please try again.");
                else
                    break;
            } catch (Exception e) {
                System.out.println("Invalid rating, please try again.");
            }
        }

        recipe.setRating(rating);

    }
}
