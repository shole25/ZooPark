import java.util.Hashtable;

public class FoodStore {

    private Hashtable<String, Integer> foodStore;



    public FoodStore() {
        this.foodStore =  new Hashtable<>();
    }

    public void addFood(String foodName, int count) {
        foodStore.put(foodName, foodStore.getOrDefault(foodName, 0) + count);

    }

    public boolean takeFood(String foodName, int count) {
        int currentQuantity = foodStore.getOrDefault(foodName, 0);
        if (currentQuantity >= count) {
            foodStore.put(foodName, currentQuantity - count);
            return true;
        }
        return false;
    }

    public boolean hasFood(String foodName){

        return foodStore.contains(foodName);

    }

}
