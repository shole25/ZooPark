import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
    private List<Enclosure> enclosures;
    private List<Zookeeper> zookeepers;
    private FoodStore zooFoodStore;

    public Zoo(List<Enclosure> enclosures, List<Zookeeper> zookeepers, FoodStore zooFoodStore) {
        this.enclosures = enclosures;
        this.zookeepers = zookeepers;
        this.zooFoodStore = zooFoodStore;
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void addZookeeper(Zookeeper zookeeper) {
        zookeepers.add(zookeeper);
    }

    public FoodStore getFoodstore() {
        return zooFoodStore;
    }

    public void aMonthPass() {

        for (Enclosure enclosure : enclosures) {
            enclosure.aMonthPasses();
        }
        for (Zookeeper zookeeper : zookeepers) {
            zookeeper.aMonthPasses();
        }
        for (Enclosure enclosure : enclosures) {
            List<Animal> healthyAnimals = enclosure.getAnimals().stream()
                    .filter(animal -> animal.getHealth() > 0)
                    .collect(Collectors.toList());
            enclosure.setAnimals(healthyAnimals);
        }
    }

    public void go() {
        while (true) {
            aMonthPass();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
