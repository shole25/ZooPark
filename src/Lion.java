import java.util.Arrays;

public class Lion extends BigCat {
    public Lion(Integer age, Gender gender, Food[] eats, Integer health, Enclosure enclosure, Integer lifeExpectancy) {
        super(age, gender, eats, health, enclosure, lifeExpectancy);
    }


    @Override
    public void stoked() {
        increaseHealth(2);
    }

    @Override
    public void increaseHealth(int health) {
        health = Math.min(health + 2, 10);

    }
}
