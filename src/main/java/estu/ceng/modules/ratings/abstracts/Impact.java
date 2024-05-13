package estu.ceng.modules.ratings.abstracts;

import java.util.ArrayList;

public class Impact implements Observer {

    ArrayList<Integer> ratings = new ArrayList<>();

    @Override
    public void update(int rating) {
        ratings.add(rating);
    }

    public int displayTotal() {
        int i = 0;
        for (int rating : ratings) {
            i += rating;
        }
        return i;
    }

    public int displayAverage() {
        int i = 0;
        for (int rating : ratings) {
            i += rating;
        }
        return i == 0 ? 0 : i / ratings.size();
    }

}