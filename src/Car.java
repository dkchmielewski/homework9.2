public class Car extends Vehicle{

    private static final double AIR_CONDITION_CONSUMPTION = 0.8;
    private boolean isAcOn;

    public Car(String name, int tankCapacity, double consumption, boolean isAcOn) {
        super(name, tankCapacity, consumption);
        this.isAcOn = isAcOn;
    }

    @Override
    public double totalConsumption() {
        return isAcOn ? getConsumption() + AIR_CONDITION_CONSUMPTION : getConsumption();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Car{" +
                "isAcOn=" + isAcOn +
                ", name='" + getName() + '\'' +
                ", tankCapacity=" + getTankCapacity() +
                ", consumption=" + getConsumption() +
                '}';
    }

    public boolean isAcOn() {
        return isAcOn;
    }

    public void setAcOn(boolean acOn) {
        isAcOn = acOn;
    }
}
