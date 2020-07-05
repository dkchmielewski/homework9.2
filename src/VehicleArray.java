public class VehicleArray {

    public static void vehicleArray() {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("mazda", 40, 2.4, false);
        vehicles[1] = new Car("honda", 48, 2.9, false);
        vehicles[2] = new Truck("dodge", 67, 5.3, false, 49);
        vehicles[3] = new Truck("toyota", 73, 6.8, false, 61);
    }

    public static String printVehicleArray(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles
        )
            return vehicles.toString();

    }
}
