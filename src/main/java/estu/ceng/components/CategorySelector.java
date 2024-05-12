package estu.ceng.components;

import estu.ceng.entities.concrete.Category;

public class CategorySelector {

    public Category selectCategory() {
        int i = 1;
        System.out.println("Please select the category of the recipe");
        for (Category category : Category.values()) {
            System.out.println(i + "." + category.toString());
            i++;
        }
        System.out.println("Enter your choice: ");
        int choice = 0;
        switch (choice) {
            case 1:
                System.out.println("Breakfast category selected");
                return Category.BREAKFAST;
            case 2:
                System.out.println("Lunch category selected");
                return Category.LUNCH;
            case 3:
                System.out.println("Dinner category selected");
                return Category.DINNER;
            case 4:
                System.out.println("Dessert category selected");
                return Category.DESSERT;
            case 5:
                System.out.println("Appetizer category selected");
                return Category.APPETIZER;
            case 6:
                System.out.println("Snack category selected");
                return Category.SNACK;
            case 7:
                System.out.println("Drink category selected");
                return Category.DRINK;
            case 8:
                System.out.println("Salad category selected");
                return Category.SALAD;
            case 9:
                System.out.println("None category selected");
                return Category.NONE;
            default:
                System.out.println("Invalid choice, please try again.");
                return selectCategory();
        }
    }

}
