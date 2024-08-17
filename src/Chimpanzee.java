

import java.util.Arrays;


public class Chimpanzee extends Ape {
//private static final Food ChimpanzeeFood[] = {Food.FRUIT, Food.ICE_CREAM};
    private static final Integer ChimpanzeeExpectancy = 24;

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
//            System.out.println("Chimpanzee do not eat " + food);
//        }
//
//    }

    @Override
    public void treat() {
        playChase();
    }


//    @Override
//    public boolean aMonthPasses() {
//        return false;
//    }

    @Override
    public void increaseHealth(int health) {
        health = Math.min(health + 4, 10);
    }

    public void playChase() {
        increaseHealth(4);
    }

    public Chimpanzee(Integer age, Gender gender, Food[] eats, Integer health, Enclosure enclosure, Integer lifeExpectancy) {
        super(age, gender, eats, health, enclosure, lifeExpectancy);
    }
}
