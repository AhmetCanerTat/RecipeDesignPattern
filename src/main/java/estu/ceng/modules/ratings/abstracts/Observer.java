
package estu.ceng.modules.ratings.abstracts;

public interface Observer {
    void update(int totalRatings, double averageRating);
}