public class Truck extends Car{

    private static final double AIR_CONDITION_CONSUMPTION = 1.6;
    private static final double ADDITIONAL_LOAD_CONSUMPTION = 0.5;
    private int load;

    public Truck(String name, int tankCapacity, double consumption, boolean isAcOn, int load) {
        super(name, tankCapacity, consumption, isAcOn);
        this.load = load;
    }

    @Override
    public double totalConsumption() {
            double totalConsumption = getConsumption();
            if (isAcOn()) {
                totalConsumption += AIR_CONDITION_CONSUMPTION;
            }
            double loadConsumption = load / 100 * ADDITIONAL_LOAD_CONSUMPTION;
            totalConsumption += loadConsumption;
            return totalConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "load=" + load +
                ", isAcOn=" + isAcOn() +
                ", name='" + getName() + '\'' +
                ", tankCapacity=" + getTankCapacity() +
                ", consumption=" + getConsumption() +
                '}';
    }

}
