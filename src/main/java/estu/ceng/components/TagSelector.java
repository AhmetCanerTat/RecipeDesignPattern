package estu.ceng.components;

import estu.ceng.entities.concrete.Tag;

public class TagSelector {
    public Tag selectTag() {
        int i = 1;
        System.out.println("Please select the tag of the recipe");
        for (Tag tag : Tag.values()) {
            System.out.println(i + "." + tag.toString());
            i++;
        }
        System.out.println("Enter your choice: ");
        int choice = 0;
        switch (choice) {
            case 1:
                System.out.println("Salty tag selected");
                return Tag.SALTY;
            case 2:
                System.out.println("Bitter tag selected");
                return Tag.BITTER;
            case 3:
                System.out.println("Sour tag selected");
                return Tag.SOUR;
            case 4:
                System.out.println("Spicy tag selected");
                return Tag.SPICY;
            case 5:
                System.out.println("Sweet tag selected");
                return Tag.SWEET;
            case 6:
                System.out.println("Cold tag selected");
                return Tag.COLD;
            case 7:
                System.out.println("Hot tag selected");
                return Tag.HOT;
            case 8:
                System.out.println("Healthy tag selected");
                return Tag.HEALTHY;
            case 9:
                System.out.println("Gluten Free tag selected");
                return Tag.GLUTENFREE;
            case 10:
                System.out.println("Vegan tag selected");
                return Tag.VEGAN;
            case 11:
                System.out.println("Vegetarian tag selected");
                return Tag.VEGETARIAN;
            case 12:
                System.out.println("Alcohol Free tag selected");
                return Tag.ALCOHOL_FREE;
            case 13:
                System.out.println("Organic tag selected");
                return Tag.ORGANIC;
            case 14:
                System.out.println("Nut Free tag selected");
                return Tag.NUT_FREE;
            default:
                System.out.println("Invalid choice, please try again.");
                return selectTag();
        }
    }

}
