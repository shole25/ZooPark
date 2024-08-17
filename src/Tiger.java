import java.util.Arrays;

public class Tiger extends BigCat {
    public Tiger(Integer age, Gender gender, Food[] eats, Integer health, Enclosure enclosure, Integer lifeExpectancy) {
        super(age, gender, eats, health, enclosure, lifeExpectancy);
    }


    @Override
    public void stoked() {
        increaseHealth(3);
    }


    @Override
    public void increaseHealth(int health) {

        health = Math.min(health + 3, 10);


    }
}