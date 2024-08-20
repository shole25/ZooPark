import java.util.Arrays;

public class Bear extends Animal {
    private static final Integer BearExpectancy = 18;
    private static final Food BearFood[] = {Food.FISH, Food.STEAK};

    public Bear(Integer age, Gender gender, Food[] eats, Integer health, Enclosure enclosure, Integer lifeExpectancy) {
        super(age, gender, eats, health, enclosure, lifeExpectancy);
    }

    @Override
    public boolean canEat(Food eats) {
        return Arrays.asList(BearFood).contains(eats);
    }

    @Override
    public void eat(Food food) {
        if (food == Food.FISH) {
            increaseHealth(3);
            getEnclosure().addWaste(2);
        } else if (food == Food.STEAK) {
            increaseHealth(3);
            getEnclosure().addWaste(4);
        } else {
            System.out.println("Bears do not eat " + food);
        }
    }

    @Override
    public void increaseHealth(int health) {
        health = Math.min(health + 3, 10);
    }


    @Override
    public void treat() {
        System.out.println("Bear Hug ");
        hug();
    }

    public void hug() {
        increaseHealth(3);
    }

    @Override
    public boolean aMonthPasses() {
        decreaseHealth();

        if (getHealth() > 0) {
            if (getEnclosure().getFoodstore().hasFood(String.valueOf(Food.FISH))) {
                eat(Food.FISH);
            } else if (getEnclosure().getFoodstore().hasFood(String.valueOf(Food.STEAK))) {
                eat(Food.STEAK);
            }
        }


        return getHealth() > 0;
    }
}
