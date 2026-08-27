abstract class Vehicle {
    String vehicleNumber;
    String brand;

    Vehicle(String vehicleNumber, String brand) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
    }

    abstract void startEngine();

    final void showVehicleIdentity() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {

    Car(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    @Override
    void startEngine() {
        System.out.println("Car engine starts.");
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    @Override
    void startEngine() {
        System.out.println("Bike engine starts.");
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car("KA01AB1234", "Toyota");
        car.showVehicleIdentity();
        car.startEngine();

        System.out.println();

        Bike bike = new Bike("KA05XY5678", "Honda");
        bike.showVehicleIdentity();
        bike.startEngine();

        System.out.println();

        car.startEngine();
        bike.startEngine();

        System.out.println();

        car.showVehicleIdentity();
        bike.showVehicleIdentity();

        System.out.println();

        Car car2 = new Car("KA09CD9876", "Hyundai");
        car2.showVehicleIdentity();

        System.out.println();

        String vehicleNumber = "";

        if (vehicleNumber.isEmpty()) {
            System.out.println("Invalid vehicle number.");
        }

        System.out.println();

        String brand = "";

        if (brand.isEmpty()) {
            System.out.println("Brand name cannot be empty.");
        }
    }
}
