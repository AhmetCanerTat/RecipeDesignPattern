package estu.ceng.modules.creation.abstracts;
import estu.ceng.entities.abstracts.Recipe;

import java.util.LinkedList;
import java.util.List;

public abstract class RecipeFactory {
        public abstract Recipe createRecipes(String name, String servingSize);
    }

