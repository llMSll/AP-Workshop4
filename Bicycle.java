class Bicycle extends Vehicle{
    private int numberOfGears;
    private boolean isElectric;

    public Bicycle(String name, int year, String color, int numberOfGears, boolean isElectric) {
        super(name, year, color);
        this.numberOfGears = numberOfGears;
        this.isElectric = isElectric;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of gears: " + numberOfGears);
        System.out.println("Is electric: " + isElectric);
    }

    public void ringBell() {
        System.out.println("Bicycle bell rings");
    }
}
