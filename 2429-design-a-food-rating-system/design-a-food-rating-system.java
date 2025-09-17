import java.util.*;

class FoodRatings {
    HashMap<String, TreeSet<String>> cuisineFoods = new HashMap<>();
    HashMap<String, String> foodCuisine = new HashMap<>();
    HashMap<String, Integer> foodRating = new HashMap<>();

    class FoodComparator implements Comparator<String> {
        public int compare(String a, String b) {
            int ratingA = foodRating.get(a);
            int ratingB = foodRating.get(b);
            if (ratingA != ratingB) {
                return ratingB - ratingA;
            }
            return a.compareTo(b);
        }
    }

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            foodCuisine.put(food, cuisine);
            foodRating.put(food, rating);
            if (!cuisineFoods.containsKey(cuisine)) {
                cuisineFoods.put(cuisine, new TreeSet<>(new FoodComparator()));
            }
            cuisineFoods.get(cuisine).add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodCuisine.get(food);
        TreeSet<String> set = cuisineFoods.get(cuisine);
        set.remove(food);
        foodRating.put(food, newRating);
        set.add(food);
    }

    public String highestRated(String cuisine) {
        return cuisineFoods.get(cuisine).first();
    }
}
