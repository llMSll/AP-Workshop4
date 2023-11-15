public class Vehicle {
    private String name;
    private int year;
    private String color;

    public Vehicle(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
    }

}
