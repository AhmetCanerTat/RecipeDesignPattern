package estu.ceng.components;

import java.util.ArrayList;
import java.util.List;

import estu.ceng.entities.concrete.Ingredient;
import estu.ceng.entities.concrete.Unit;

public  class AddIngredient {

    static List<Ingredient> createIngredientList() {
        System.out.println("Adding ingredients to the recipe");
        List<Ingredient> ingredients = new ArrayList<>();

        while (true) {
            System.out.println(
                    "Please enter the name of the ingredient(type done when finished): ");
            String name = System.console().readLine();
            if (name.equals("done")) {
                break;
            }
            Ingredient ingredient = createIngredient(name);
            if (ingredient != null) {
                ingredients.add(ingredient);
            }
        }

        return ingredients;
    }

    private static Ingredient createIngredient(String name) {
        System.out.println("Please enter the amount of the ingredient: ");
        double amount;
        while (true) {
            try {

                amount = Double.parseDouble(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
                return createIngredient(name);
            }
        }

        Unit unit = null;
        System.out.println("Please select the unit of the ingredient");
        int i = 1;
        for (Unit u : Unit.values()) {
            System.out.println(i + "." + u.toString());
            i++;
        }
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
                unit = Unit.BOTTLE;
                break;
            case 2:
                unit = Unit.CAN;
                break;
            case 3:
                unit = Unit.CUP;
                break;
            case 4:
                unit = Unit.KILOGRAM;
                break;
            case 5:
                unit = Unit.LITER;
                break;
            case 6:
                unit = Unit.PIECE;
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                return createIngredient(name);
        }
        return new Ingredient(name, amount, unit);
    }
}
