

import java.util.Arrays;

public class Elephant extends Animal {
    private static final Integer ElephantExpectancy = 36;
   private static final Food ElephantFood[] = {Food.HAY, Food.FRUIT};

    public Elephant(Integer age, Gender gender, Food[] eats, Integer health, Enclosure enclosure, Integer lifeExpectancy) {
        super(age, gender, eats, health, enclosure, lifeExpectancy);
    }

    @Override
    public boolean canEat(Food eats) {
        return Arrays.asList(ElephantFood).contains(eats);
 }

    @Override
    public void eat(Food food) {
        if (food == Food.FRUIT) {
            increaseHealth(2);
            getEnclosure().addWaste(3);
        } else if (food == Food.HAY) {
            increaseHealth(1);
            getEnclosure().addWaste(4);
        } else {
            System.out.println("Elephants do not eat " + food);
        }
    }

    @Override
    public void increaseHealth(int health) {
        health = Math.min(health + 5, 10);
    }


    @Override
    public void treat() {
        System.out.println("Elephant bath by PhysioZookeeper");
        bath();
    }

    public void bath() {
        increaseHealth(5);
    }
    @Override
    public boolean aMonthPasses () {
        decreaseHealth();

        if (getHealth() > 0) {
            if (getEnclosure().getFoodstore().hasFood(String.valueOf(Food.FRUIT))) {
                eat(Food.FRUIT);
            } else if (getEnclosure().getFoodstore().hasFood(String.valueOf(Food.HAY))) {
                eat(Food.HAY);
            }
        }


        return getHealth() > 0;
    }
}
