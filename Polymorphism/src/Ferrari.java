public class Ferrari extends Vehicle {

    private int year;

    @Override
    public String overview() {
        String s = super.overview();
        s += String.format("Year: %d\n", this.year);
        return s;
    }

    Ferrari(String licensePlate, String color, int year) {
        super(licensePlate, color, 2, 150, 330);
        System.out.println("Ferrari\n"+overview());
        this.year = year;
    }
}
