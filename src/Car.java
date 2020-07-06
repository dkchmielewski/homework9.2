public class Car extends Vehicle{
    boolean isAcOn;

    public Car(String name, int tankCapacity, double consumption, boolean isAcOn) {
        super(name, tankCapacity, consumption);
        this.isAcOn = isAcOn;
    }

    @Override
    public double range(Vehicle vehicle) {
        double range = 0.0;
        if (isAcOn) {
            range = tankCapacity / consumption;
            return range;
        } else if (isAcOn = false) {
            range = tankCapacity / consumption - 0.2;
        }
        return range;
    }
    @Override
    public String toString() {
        return super.toString() +
                "Car{" +
                "isAcOn=" + isAcOn +
                ", name='" + name + '\'' +
                ", tankCapacity=" + tankCapacity +
                ", consumption=" + consumption +
                '}';
    }
}
