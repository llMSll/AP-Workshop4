public class Truck extends Vehicle{
    private double cargoCapacity;

    public Truck(String name, int year, String color, double cargoCapacity) {
        super(name, year, color);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity (lbs): " + cargoCapacity);
    }

    public void loadCargo() {
        System.out.println("Truck is loading cargo");
    }
}
