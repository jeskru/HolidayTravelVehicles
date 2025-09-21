public class Main {
    public static void main(String[] args) {
        // Create a new Vehicle object
        NewVehicle myVehicle = new NewVehicle();

        myVehicle.serialNumber = "VIN123456789";
        myVehicle.name = "Jenny";
        myVehicle.model = "Mazda Miata MX-5";
        myVehicle.year = 1999;
        myVehicle.manufacturer = "Mazda";
        myVehicle.baseCost = 200000;

        System.out.println("Vehicle Information:");
        System.out.println("Serial Number: " + myVehicle.serialNumber);
        System.out.println("Name: " + myVehicle.name);
        System.out.println("Model: " + myVehicle.model);
        System.out.println("Year: " + myVehicle.year);
        System.out.println("Manufacturer: " + myVehicle.manufacturer);
        System.out.println("Base Cost: $" + myVehicle.baseCost);
    }
}
