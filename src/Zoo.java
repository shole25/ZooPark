import java.util.List;

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

}
