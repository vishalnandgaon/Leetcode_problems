// Last updated: 18/09/2025, 12:09:55
import java.util.*;

class FoodRatings {
    // Maps food to [cuisine, rating]
    Map<String, String> foodToCuisine;
    Map<String, Integer> foodToRating;

    // For each cuisine, store TreeSet of foods sorted by (rating descending, name ascending)
    Map<String, TreeSet<String>> cuisineToFoods;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodToRating = new HashMap<>();
        cuisineToFoods = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodToCuisine.put(food, cuisine);
            foodToRating.put(food, rating);

            cuisineToFoods.putIfAbsent(cuisine, new TreeSet<>((a, b) -> {
                int diff = foodToRating.get(b) - foodToRating.get(a);
                if (diff == 0) return a.compareTo(b);
                return diff;
            }));

            cuisineToFoods.get(cuisine).add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        TreeSet<String> set = cuisineToFoods.get(cuisine);

        // Remove and re-insert to update the TreeSet
        set.remove(food);
        foodToRating.put(food, newRating);
        set.add(food);
    }

    public String highestRated(String cuisine) {
        return cuisineToFoods.get(cuisine).first();
    }
}
