package estu.ceng.entities.abstracts;

import estu.ceng.entities.concrete.Category;
import estu.ceng.entities.concrete.Ingredient;
import estu.ceng.entities.concrete.Size;
import estu.ceng.entities.concrete.Tag;
import estu.ceng.modules.creation.concrete.RecipeType;
import estu.ceng.modules.ratings.abstracts.Subject;
import estu.ceng.modules.ratings.abstracts.Observer;

import java.util.*;

public class Recipe implements Subject {
    private int id;

    private String name;

    private Size servingSize;

    private RecipeType type;

    private final List<Ingredient> ingredients = new ArrayList<Ingredient>();

    private final List<Category> categories = new ArrayList<>();

    private final List<Tag> tags = new ArrayList<>();

    private ArrayList<String> instructions = new ArrayList<>();

    private List<Observer> observers = new ArrayList<>();
    private int totalRatings;
    private double averageRating;

    public Recipe(String name, Size size) {
        this.id = new Random().nextInt();
        this.name = name;
        size = servingSize;
        categories.add(Category.NONE);
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(totalRatings, averageRating);
        }
    }

    public ArrayList<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(ArrayList<String> instructions) {
        this.instructions = instructions;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void addCategory(Category category) {
        categories.remove(Category.NONE);

        if (categories.size() < 3) {
            categories.add(category);
        } else {
            System.out.println("You can't add more than 3 categories");
        }

    }

    public void addTag(Tag tag) {
        if (tags.size() < 3) {
            tags.add(tag);
        } else {
            System.out.println("You can't add more than 3 tags");
        }
    }

    public void setCategories(HashSet<Category> categories) {
        this.categories.clear();
        for (Category category : categories) {
            this.categories.add(category);
        }
    }

    public void setTags(HashSet<Tag> tags) {
        this.tags.clear();
        for (Tag tag : tags) {
            this.tags.add(tag);
        }
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    public void removeCategory(Category category) {
        categories.remove(category);
    }

    public void removeTag(Tag tag) {
        tags.remove(tag);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return servingSize;
    }

    public void setSize(Size size) {
        servingSize = size;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients.clear();
        this.ingredients.addAll(ingredients);
    }

    public List<Category> getCategories() {
        return categories;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public RecipeType getType() {
        return type;
    }

    public void setType(RecipeType type) {
        this.type = type;
    }
}
