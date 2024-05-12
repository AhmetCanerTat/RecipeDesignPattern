package estu.ceng.components;

import estu.ceng.entities.concrete.Size;

public class SizeSelector {

    public Size selectSize() {
        int i = 1;
        System.out.println("Please select the size of the recipe");
        for (Size size : Size.values()) {
            System.out.println(i + "." + size.toString());
            i++;
        }
        System.out.println("Enter your choice: ");
        int choice = 0;
        switch (choice) {
            case 1:
                System.out.println("Small size selected");
                return Size.SMALL;
            case 2:
                System.out.println("Medium size selected");
                return Size.MEDIUM;
            case 3:
                System.out.println("Large size selected");
                return Size.LARGE;
            case 4:
                System.out.println("Extra Large size selected");
                return Size.EXTRA_LARGE;
            default:
                System.out.println("Invalid choice, please try again.");
                return selectSize();
        }
    }
}
