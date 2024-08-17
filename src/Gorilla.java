

import java.util.Arrays;

public class Gorilla extends Ape{
    private static final Integer GorillaExpectancy=32;

    public Gorilla(Integer age, Gender gender, Food[] eats, Integer health, Enclosure enclosure, Integer lifeExpectancy) {
        super(age, gender, eats, health, enclosure, lifeExpectancy);
    }

    @Override
    public boolean canEat(Food eats) {
        return Arrays.asList(ApeFood).contains(eats);
    }

//    @Override
//    public void eat(Food food) {
//        if (food == Food.FRUIT) {
//            increaseHealth(2);
//            getEnclosure().addWaste(3);
//        } else if (food == Food.ICE_CREAM) {
//            increaseHealth(1);
//            getEnclosure().addWaste(3);
//        } else {
//            System.out.println("Gorilla do not eat " + food);
//        }
//    }

    @Override
    public void treat() {
painting();
    }

//    @Override
//    public boolean aMonthPasses() {
//        return false;
//    }
public void painting() {
    increaseHealth(4);
}

    @Override
    public void increaseHealth(int health) {
        health = Math.min(health + 4, 10);
    }
}
