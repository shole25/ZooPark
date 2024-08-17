import java.util.Hashtable;

public class FoodStore {

    private Hashtable<String, Integer> foodStore;


    public FoodStore(Hashtable<String, Integer> foodStore) {
        this.foodStore = foodStore;
    }

    public FoodStore() {
        this.foodStore = foodStore;
    }

    public void addFood(String foodName, int count) {
        foodStore.put(foodName, foodStore.getOrDefault(foodName, 0) + count);

    }

    public boolean takeFood(String foodName, int count) {
        int currentquantity = foodStore.get(foodName);
        if (currentquantity >= count) {
            foodStore.put(foodName, currentquantity - count);

        }
        return false;
    }

    public boolean hasFood(String foodName){
        return foodStore.containsKey(foodName);

    }

}
