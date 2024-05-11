package estu.ceng.modules.creation.abstracts;

import estu.ceng.entities.abstracts.Recipe;

public abstract class RecipeFactory {
    public abstract Recipe createRecipes(String name, String servingSize);
}
