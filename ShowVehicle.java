// Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum
// speed. Vehicles can be of different types such as cars, trucks, and bicycles.

// Cars have an additional attribute: the number of passengers it can carry.
// Trucks have an additional attribute: the maximum weight they can carry.
// Bicycles do not have any additional attributes.
// Implement the following functionalities:

// Create a superclass named "Vehicle" with attributes:
// identificationNumber (String)
// maxSpeed (double)
// Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
// For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
// Implement a method in each subclass to display the details of the vehicle.
// In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.

class Vehicle {
    String idnum;
    double maxSpeed;
    public Vehicle(String id, double max) {
        this.idnum = id;
        this.maxSpeed = max;
    }
}

class Car extends Vehicle {
    private int numpas;

    public Car(String id, double max, int pass) {
        super(id, max);
        this.numpas = pass;
    }
    public void display() {
        System.out.println("Car ID: " + idnum);
        System.out.println("Maximum Speed: " + maxSpeed);
        System.out.println("Number of Passengers: " + numpas);
    }
}

class Truck extends Vehicle {
    private double weight;
    public Truck(String id, double max, double wei) {
        super(id, max);
        this.weight = wei;
    }
    public void display() {
        System.out.println("Truck ID: " + idnum);
        System.out.println("Maximum Speed: " + maxSpeed);
        System.out.println("Maximum Weight: " + weight);
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String id, double max) {
        super(id, max);
    }
    public void display() {
        System.out.println("Bicycle ID: " + idnum);
        System.out.println("Maximum Speed: " + maxSpeed);
    }
}

public class ShowVehicle {
    public static void main(String args[]) {
        Car car = new Car("A747McLarane", 420.0, 2);
        Truck truck = new Truck("B747Tata", 140.0, 1000.0);
        Bicycle bicycle = new Bicycle("C747BSA", 20.0);

        car.display();
        truck.display();
        bicycle.display();
    }
}
 