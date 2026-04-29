public class Upgrade {
    private String name;
    private double cost;

    public Upgrade(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() { return name; }
    public double getCost() { return cost; }
}