public class Car extends Vehicle{
    boolean isAcOn;

    public Car(String name, int tankCapacity, double consumption, boolean isAcOn) {
        super(name, tankCapacity, consumption);
        this.isAcOn = isAcOn;
    }


    public void isOn(Car car) {
        car.consumption = 0.8;
    }
    public void isOff(Car car) {
        car.consumption = 0.6;
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
