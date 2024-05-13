package estu.ceng.modules.creation.abstracts;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.Size;

public abstract class RecipeFactory {
    public abstract Recipe createRecipes(String name, Size servingSize);
}
