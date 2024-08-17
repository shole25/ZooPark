

public abstract class Ape extends Animal{
    protected static final  Food ApeFood[]={Food.ICE_CREAM,Food.FRUIT};
    public Ape(Integer age, Gender gender, Food[] eats, Integer health, Enclosure enclosure, Integer lifeExpectancy) {
        super(age, gender, eats, health, enclosure, lifeExpectancy);
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
            System.out.println(getClass().getSimpleName() + " does not eat " + food);
        }
    }
        @Override
        public boolean aMonthPasses () {
            decreaseHealth();

            if (getHealth() > 0) {
                if (getEnclosure().getFoodstore().hasFood(String.valueOf(Food.FRUIT))) {
                    eat(Food.FRUIT);
                } else if (getEnclosure().getFoodstore().hasFood(String.valueOf(Food.ICE_CREAM))) {
                    eat(Food.ICE_CREAM);
                }
            }


            return getHealth() > 0;
        }
    }

