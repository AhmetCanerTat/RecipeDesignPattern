package estu.ceng.components;

import java.util.HashSet;

import estu.ceng.entities.concrete.Category;

public class CategorySelector {

    static HashSet<Category> createCategoryList() {
        HashSet<Category> categories = new HashSet<>(3);
        int i = 1;
        System.out.println("Please select the category of the recipe");
        for (Category category : Category.values()) {
            System.out.println(i + "." + category.toString());
            i++;
        }

        while (categories.size() < 3) {
            int choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 1:
                    System.out.println("Breakfast category selected");
                    categories.add(Category.BREAKFAST);
                    break;
                case 2:
                    System.out.println("Lunch category selected");
                    categories.add(Category.LUNCH);
                    break;
                case 3:
                    System.out.println("Dinner category selected");
                    categories.add(Category.DINNER);
                    break;
                case 4:
                    System.out.println("Dessert category selected");
                    categories.add(Category.DESSERT);
                    break;
                case 5:
                    System.out.println("Appetizer category selected");
                    categories.add(Category.APPETIZER);
                    break;
                case 6:
                    System.out.println("Snack category selected");
                    categories.add(Category.SNACK);
                    break;
                case 7:
                    System.out.println("Drink category selected");
                    categories.add(Category.DRINK);
                    break;
                case 8:
                    System.out.println("Salad category selected");
                    categories.add(Category.SALAD);
                    break;
                case 9:
                    System.out.println("None category selected");
                    categories.add(Category.NONE);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
        return categories;
    }

    public Category selectCategory() {

        int i = 1;
        System.out.println("Please select the category of the recipe");
        for (Category category : Category.values()) {
            System.out.println(i + "." + category.toString());
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
