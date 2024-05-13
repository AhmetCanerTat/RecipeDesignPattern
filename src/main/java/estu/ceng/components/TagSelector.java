package estu.ceng.components;

import java.util.HashSet;

import estu.ceng.entities.concrete.Tag;

public class TagSelector {
    static HashSet<Tag> createTagList() {
        HashSet<Tag> tags = new HashSet<>(3);
        int i = 1;
        System.out.println("Please select the tag of the recipe");
        for (Tag tag : Tag.values()) {
            System.out.println(i + "." + tag.toString());
            i++;
        }

        while (tags.size() < 3) {
            int choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 1:
                    System.out.println("Salty tag selected");
                    tags.add(Tag.SALTY);
                    break;
                case 2:
                    System.out.println("Bitter tag selected");
                    tags.add(Tag.BITTER);
                    break;
                case 3:
                    System.out.println("Sour tag selected");
                    tags.add(Tag.SOUR);
                    break;
                case 4:
                    System.out.println("Spicy tag selected");
                    tags.add(Tag.SPICY);
                    break;
                case 5:
                    System.out.println("Sweet tag selected");
                    tags.add(Tag.SWEET);
                    break;
                case 6:
                    System.out.println("Cold tag selected");
                    tags.add(Tag.COLD);
                    break;
                case 7:
                    System.out.println("Hot tag selected");
                    tags.add(Tag.HOT);
                    break;
                case 8:
                    System.out.println("Healthy tag selected");
                    tags.add(Tag.HEALTHY);
                    break;
                case 9:
                    System.out.println("Gluten Free tag selected");
                    tags.add(Tag.GLUTENFREE);
                    break;
                case 10:
                    System.out.println("Vegan tag selected");
                    tags.add(Tag.VEGAN);
                    break;
                case 11:
                    System.out.println("Vegetarian tag selected");
                    tags.add(Tag.VEGETARIAN);
                    break;
                case 12:
                    System.out.println("Alcohol Free tag selected");
                    tags.add(Tag.ALCOHOL_FREE);
                    break;
                case 13:
                    System.out.println("Organic tag selected");
                    tags.add(Tag.ORGANIC);
                    break;
                case 14:
                    System.out.println("Nut Free tag selected");
                    tags.add(Tag.NUT_FREE);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
        return tags;
    }

    public Tag selectTag() {
        int i = 1;
        System.out.println("Please select the tag of the recipe");
        for (Tag tag : Tag.values()) {
            System.out.println(i + "." + tag.toString());
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
