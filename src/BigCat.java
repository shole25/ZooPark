import java.util.Arrays;

public abstract class BigCat extends Animal {
    protected static final Food BigCatFood[]={Food.CELERY,Food.STEAK};
    protected static final Integer BigCatExpectancy=24;

    public BigCat(Integer age, Gender gender, Food[] eats, Integer health, Enclosure enclosure, Integer lifeExpectancy) {
        super(age, gender, eats, health, enclosure, lifeExpectancy);
    }
    @Override
    public void eat(Food food) {
        if (food == Food.CELERY) {
            increaseHealth(0);
            getEnclosure().addWaste(1);
        } else if (food == Food.STEAK) {
            increaseHealth(3);
            getEnclosure().addWaste(4);
        } else {
            System.out.println(getClass().getSimpleName() + " does not eat " + food);
        }
    }
    @Override
    public boolean aMonthPasses () {
        decreaseHealth();

        if (getHealth() > 0) {
            if (getEnclosure().getFoodstore().hasFood(String.valueOf(Food.CELERY))) {
                eat(Food.CELERY);
            } else if (getEnclosure().getFoodstore().hasFood(String.valueOf(Food.STEAK))) {
                eat(Food.STEAK);
            }
        }


        return getHealth() > 0;
    }
    @Override
    public boolean canEat(Food eats) {
        return Arrays.asList(BigCatFood).contains(eats);
    }
    public abstract void stoked();

    public void treat() {
        stoked();
    }
}
