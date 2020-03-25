public class Vehicle {
    private String licensePlate;
    private String color;
    private int numDoors;
    private int speed;
    private int maxSpeed;

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
        Vehicle one = new Ferrari("FERA RI$", "Red", 2019);

        Vehicle two = new SmartCar("SMRT CAR", "Green", "Hybrid", 160);

    }
}
