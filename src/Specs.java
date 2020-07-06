public class Specs {
    public static void main(String[] args) {

        Car[] cars = new Car[2];
        cars[0] = new Car("BMW M3", 60, 12, false);
        cars[1] = new Truck("Scania", 80, 22, false, 600);

        for (Car car : cars) {
            System.out.println(car.getName() + ", spala: " + car.range());
        }

        for (Car car : cars) {
            car.setAcOn(true);
            System.out.println(car.getName() + ", spala: " + car.range());
        }
    }
}
