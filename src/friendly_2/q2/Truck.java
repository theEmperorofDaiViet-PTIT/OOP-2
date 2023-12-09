package friendly_2.q2;

public class Truck extends Transport{

    private double capacity;

    public Truck() {

    }

    public Truck(String code, String manufacturer, int yearOfProduction, double price, String color, double capacity) {
        super(code, manufacturer, yearOfProduction, price, color);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + '\t' +
               capacity;
    }
}
