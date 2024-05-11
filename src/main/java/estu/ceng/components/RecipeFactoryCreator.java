package estu.ceng.components;

import javax.print.attribute.standard.MediaSize.Other;

import estu.ceng.modules.creation.abstracts.RecipeFactory;
import estu.ceng.modules.creation.concrete.IndianRecipeFactory;
import estu.ceng.modules.creation.concrete.MexicanRecipeFactory;
import estu.ceng.modules.creation.concrete.MiddleEasternRecipeFactory;
import estu.ceng.modules.creation.concrete.OtherRecipeFactory;
import estu.ceng.modules.creation.concrete.WesternRecipeFactory;

public class RecipeFactoryCreator {
    RecipeFactory getRecipeStyle() {
        RecipeFactory recipeFactory;
        System.out.println("===== Select Recipe Style =====");
        System.out.println("1. Indian Recipe");
        System.out.println("2. Mexican Recipe");
        System.out.println("3. Middle Eastern Recipe");
        System.out.println("4. Western Recipe");
        System.out.println("5. Other Recipe");
        System.out.println("================================");

        System.out.println("Enter your choice: ");
        int choice = 0;

        while (true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }

        switch (choice) {
            case 1:
                System.out.println("Indian Recipe Style Selected");
                recipeFactory = new IndianRecipeFactory();
                return recipeFactory;
            case 2:
                System.out.println("Mexican Recipe Style Selected");
                recipeFactory = new MexicanRecipeFactory();
                return recipeFactory;
            case 3:
                System.out.println("Middle Eastern Style Selected");
                recipeFactory = new MiddleEasternRecipeFactory();
                return recipeFactory;
            case 4:
                System.out.println("Western Recipe Style Selected");
                recipeFactory = new WesternRecipeFactory();
                return recipeFactory;
            case 5:
                System.out.println("Other Recipe Style Selected");
                System.out.println("Please enter the name of the style");
                String style = System.console().readLine();
                recipeFactory = new OtherRecipeFactory(style);
                return recipeFactory;
            default:
                System.out.println("Invalid choice, please try again......");
                getRecipeStyle();
                return null;
        }
    }

}
