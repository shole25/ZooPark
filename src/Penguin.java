import java.util.Arrays;

public class Penguin extends Animal {
    private static final Integer PenguinExpectancy = 15;
    private static final Food PenguinFood[] = {Food.ICE_CREAM, Food.FISH};

    public Penguin(Integer age, Gender gender, Food[] eats, Integer health, Enclosure enclosure, Integer lifeExpectancy) {
        super(age, gender, eats, health, enclosure, lifeExpectancy);
    }

    @Override
    public boolean canEat(Food eats) {
        return Arrays.asList(PenguinFood).contains(eats);
    }

    @Override
    public void eat(Food food) {
        if (food == Food.FISH) {
            increaseHealth(2);
            getEnclosure().addWaste(3);
        } else if (food == Food.ICE_CREAM) {
            increaseHealth(1);
            getEnclosure().addWaste(4);
        } else {
            System.out.println("Penguin do not eat " + food);
        }
    }

    @Override
    public void increaseHealth(int health) {
        health = Math.min(health + 2, 10);
    }


    @Override
    public void treat() {
        System.out.println("Penguin watchAFilm ");
        watchAFilm ();
    }

    public void watchAFilm () {
        increaseHealth(2);
    }
    @Override
    public boolean aMonthPasses () {
        decreaseHealth();

        if (getHealth() > 0) {
            if (getEnclosure().getFoodstore().hasFood(String.valueOf(Food.FISH))) {
                eat(Food.FISH);
            } else if (getEnclosure().getFoodstore().hasFood(String.valueOf(Food.ICE_CREAM))) {
                eat(Food.ICE_CREAM);
            }
        }


        return getHealth() > 0;
    }
}
