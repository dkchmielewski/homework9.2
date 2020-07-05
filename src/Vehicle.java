public class Vehicle {
    String name;
    int tankCapacity;
    double consumption;

    public Vehicle(String name, int tankCapacity, double consumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.consumption = consumption;
    }

    public double range(Vehicle vehicle) {
        double range = tankCapacity/consumption;
        return range;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", tankCapacity=" + tankCapacity +
                ", consumption=" + consumption +
                '}';
    }
}
