public class SmartCar extends Vehicle {

    String fuel;
    Integer mileage;

    @Override
    public String overview() {
        String s = super.overview();
        s += String.format("Fuel type: %s\nMileage: %d\n", fuel, mileage);
        return s;
    }

    SmartCar(String licensePlate, String color, String fueltype, Integer mileage) {
        super(licensePlate, color, 2, 30, 50);
        this.fuel = fueltype;
        this.mileage = mileage;
        System.out.println("Smart car:\n" + overview());
    }

}
