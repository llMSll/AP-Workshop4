class Car extends Vehicle{
    private String model;
    private String fuelType;

    public Car(String name, int year, String color, String model, String fuelType) {
        super(name, year, color);
        this.model = model;
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }
}
