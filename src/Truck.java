public class Truck extends Car{
    int load;

    public Truck(String name, int tankCapacity, double consumption, boolean isAcOn, int load) {
        super(name, tankCapacity, consumption, isAcOn);
        this.load = load;
    }
    public void isOn(Truck truck) {
        truck.consumption = 0.8;
    }
    public void isOff(Truck truck) {
        truck.consumption = 1.2;
    }

    public void extraLoad(Truck truck) {
        load = truck.load + 100;
        truck.consumption += 0.5;
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
