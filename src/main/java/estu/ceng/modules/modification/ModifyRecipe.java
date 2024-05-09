package estu.ceng.modules.modification;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.entities.concrete.Category;
import estu.ceng.entities.concrete.Ingredient;
import estu.ceng.entities.concrete.Tag;

import java.util.ArrayList;
import java.util.List;

public class ModifyRecipe {
        Recipe recipe;

        public ModifyRecipe(Recipe recipe) {
            this.recipe = recipe;
        }

        public void modifyRecipeName(String name) {
            recipe.setName(name);
        }


        public void modifyRecipeSize(String servingSize) {
            recipe.setSize(servingSize);
        }

        public void modifyRecipeCategories(ArrayList<Category> categories) {
            recipe.setCategories(categories);
        }

        public void modifyRecipeTags(ArrayList<Tag> tags) {
            recipe.setTags(tags);

        }

        public void modifyRecipeIngredients(List<Ingredient> ingredient) {
            recipe.setIngredients(ingredient);
        }

        // no need to modify categories and tags

        public void modifyRecipeInstructions(ArrayList<String> instructions) {
            recipe.setInstructions(instructions);
        }

    }
