import javax.swing.*;

public class Vehicle {
    private String licensePlate;
    private String color;
    private int numDoors;
    private int speed;
    private int maxSpeed;

    protected void Accelerate() {

    }

    protected void Brake() {

    }

    Vehicle(String licensePlate, String color, int numDoors, int speed, int maxSpeed) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.numDoors = numDoors;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public String overview() {
        return String.format("License Plate: %s \nColour: %s \nNumber of doors: %d \nSpeed: %d \nMaxSpeed: %d\n",
                                licensePlate, color, numDoors, speed, maxSpeed);
    }

    public static void main(String[] args) {
        System.out.println("Vehicle #1");
        Vehicle one = new Vehicle("ABCD 123", "Black", 4, 120, 200);
        System.out.print(one.overview());

        Vehicle two = new Vehicle("EFGH 456", "White", 1, 10, 20);
        System.out.println("Vehicle #2");
        System.out.print(two.overview());
    }
}
