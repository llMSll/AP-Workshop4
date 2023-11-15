class Motorcycle extends Vehicle{
    private int engineSize;
    private int topSpeed;

    public Motorcycle(String name, int year, String color, int engineSize, int topSpeed) {
        super(name, year, color);
        this.engineSize = engineSize;
        this.topSpeed = topSpeed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Size: (cc)" + engineSize);
        System.out.println("Top Speed: (mph)" + topSpeed);
    }

    public void wheelie() {
        System.out.println("Motorcycle performs a wheelie");
    }
}
