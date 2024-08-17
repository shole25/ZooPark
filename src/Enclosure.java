

import java.util.ArrayList;


public class Enclosure {

    public ArrayList<Animal> animals;
    public FoodStore food;
    public Integer waste;

    public Enclosure(ArrayList<Animal> animals, FoodStore food, Integer waste) {
        this.animals = animals;
        this.food = food;
        this.waste = waste;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        if (animals.size() < 20) {
            animals.add(animal);
            animal.setEnclosure(this);
        } else {
            System.out.println("Enclosure is full");
        }
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void removeWaste(int amount) {
        waste = Math.max(waste - amount, 0);
    }

    public void addWaste(int amount) {
        waste += amount;
    }

    public int getWasteSize() {
        return waste;
    }

    public FoodStore getFoodstore() {
        return food;
    }

    public int size() {
        return animals.size();
    }

}
