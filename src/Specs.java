public class Specs {
    public static void main(String[] args) {

        Car car = new Car("volvo", 30, 0.6, false);
        car.isOn(car);
        System.out.println(car.toString());

        Truck truck = new Truck("skania", 60, 1.2, false, 20);
        truck.isOn(truck);
        System.out.println(truck.toString());
        truck.extraLoad(truck);
        System.out.println(truck.toString());
        System.out.println(car.range(car));
        System.out.println(truck.range(truck));


    }
}
