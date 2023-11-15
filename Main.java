public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicleObjects = new Vehicle[4];
        ////////////////////////////////
        // User-based input;
        vehicleObjects[1] = new Car("Honda", 1972, "Green", "Honda civic", "gasoline");

        vehicleObjects[0] = new Bicycle("Giant", 1980, "Blue", 9, false);

        vehicleObjects[3] = new Motorcycle("BMW", 2000, "Green", 650, 165);

        vehicleObjects[2] = new Truck("Ken_worth", 1990, "White", 26000);

        ////////////////////////////////


        for (Vehicle vehicle : vehicleObjects) {        // for-each loop to traverse the vehicle objects array
            if(vehicle instanceof Car) {
                vehicle.displayInfo();
                ((Car) vehicle).startEngine();              //Typecasting from vehicle to Car
            }
            else if(vehicle instanceof Motorcycle) {
                vehicle.displayInfo();
                ((Motorcycle) vehicle).wheelie();           //Typecasting from vehicle to Motorcycle
            }
            else if(vehicle instanceof Bicycle) {
                vehicle.displayInfo();
                ((Bicycle) vehicle).ringBell();             //Typecasting from vehicle to Bicycle
            }
            else if(vehicle instanceof Truck) {
                vehicle.displayInfo();
                ((Truck) vehicle).loadCargo();              //Typecasting from vehicle to Truck
            }
            else {
                System.out.println("The object is not in the list!");
            }
            System.out.println();                   //Newline;
        }
    }
}