import java.util.Arrays;

public class Giraffe extends Animal {
    private static final Integer GiraffeExpectancy = 15;
    private static final Food GiraffeFood[] = {Food.ICE_CREAM, Food.FISH};

    public Giraffe(Integer age, Gender gender, Food[] eats, Integer health, Enclosure enclosure, Integer lifeExpectancy) {
        super(age, gender, eats, health, enclosure, lifeExpectancy);
    }

    @Override
    public boolean canEat(Food eats) {
        return Arrays.asList(GiraffeFood).contains(eats);
    }

    @Override
    public void eat(Food food) {
        if (food == Food.FRUIT) {
            increaseHealth(2);
            getEnclosure().addWaste(3);
        } else if (food == Food.ICE_CREAM) {
            increaseHealth(1);
            getEnclosure().addWaste(3);
        } else {
            System.out.println("Giraffe do not eat " + food);
        }
    }

    @Override
    public void increaseHealth(int health) {
        health = Math.min(health + 4, 10);
    }


    @Override
    public void treat() {
        System.out.println("Giraffe neckMassage by PhysioZookeeper");
        neckMassage();
    }

    public void neckMassage() {
        increaseHealth(4);
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
