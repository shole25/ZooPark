

import java.util.Arrays;

public abstract class Animal {
    private Integer age;
    private Gender gender;
    private Food eats[];
    private Integer health;
    private Enclosure enclosure;
    private Integer lifeExpectancy;

    public Animal(Integer age, Gender gender, Food[] eats, Integer health, Enclosure enclosure, Integer lifeExpectancy) {
        this.age = age;
        this.gender = gender;
        this.eats = eats;
        this.health = health;
        this.enclosure = enclosure;
        this.lifeExpectancy = lifeExpectancy;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    abstract public boolean canEat(Food eats);

    abstract public void eat(Food food);


    abstract public void treat();

    abstract public boolean aMonthPasses();

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }


    public Integer getHealth() {
        return health;
    }
public boolean aMonthpass(){ return false;}

    public abstract void increaseHealth(int health);

    public void decreaseHealth() {
        health = Math.max(health - 2, 0);
    }

    public Integer getLifeExpectancy() {
        return lifeExpectancy;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender=" + gender +
                ", eats=" + Arrays.toString(eats) +
                ", health=" + health +
                ", enclosure=" + enclosure +
                ", lifeExpectancy=" + lifeExpectancy +
                '}';
    }
}
