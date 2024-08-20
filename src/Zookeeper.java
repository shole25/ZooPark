import java.util.List;

public class Zookeeper {
    public Enclosure enclosure;


    public Zookeeper(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public void aMonthPasses() {

        moveFood();
        removeWaste(20);
        treatAnimals();
    }

    protected void moveFood() {

    }

    protected void removeWaste(int wasteToRemove) {
        wasteToRemove = Math.min(20, enclosure.getWasteSize());
        enclosure.removeWaste(wasteToRemove);
    }

    protected void treatAnimals() {
        List<Animal> animals = enclosure.getAnimals();
        for (int i = 0; i < animals.size() && i < 2; i++) {
            animals.get(i).treat();
        }
    }
}

