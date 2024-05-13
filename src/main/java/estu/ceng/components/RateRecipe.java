package estu.ceng.components;

import estu.ceng.entities.abstracts.Recipe;
import estu.ceng.modules.ratings.abstracts.Observer;
import estu.ceng.modules.ratings.abstracts.Subject;

public class RateRecipe implements Observer {

    private int rating;
    private Subject Recipe;

    public RateRecipe(Subject Recipe) {

        this.Recipe = Recipe;
        Recipe.registerObserver(this);
    }

    public void update(int rating) {
        this.rating = rating;
    }

}
