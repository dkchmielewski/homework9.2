public class Vehicle {
    private String name;
    private int tankCapacity;
    private double consumption;

    public Vehicle(String name, int tankCapacity, double consumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.consumption = consumption;
    }

    public double range() {
        double range = tankCapacity/totalConsumption() * 100;
        return range;
    }

    public double totalConsumption() {
        return consumption;
    }

    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", tankCapacity=" + tankCapacity +
                ", consumption=" + consumption +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public double getConsumption() {
        return consumption;
    }

}
