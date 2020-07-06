public class Truck extends Car{
    int load;

    public Truck(String name, int tankCapacity, double consumption, boolean isAcOn, int load) {
        super(name, tankCapacity, consumption, isAcOn);
        this.load = load;
    }

    public void extraLoad(Truck truck) {
        load = truck.load + 100;
        truck.consumption += 0.5;
    }

    @Override
    public double range(Vehicle vehicle) {
        double range = 0.0;
        if (isAcOn) {
            range = tankCapacity / consumption;
            return range;
        } else
            range = tankCapacity / consumption - 0.2;
            return range;
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "load=" + load +
                ", isAcOn=" + isAcOn +
                ", name='" + name + '\'' +
                ", tankCapacity=" + tankCapacity +
                ", consumption=" + consumption +
                '}';
    }
}
