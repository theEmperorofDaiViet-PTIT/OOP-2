package friendly_2.q2;

public class Car extends Transport {

    private String engine;

    private int numberOfSeats;

    public Car() {

    }

    public Car(String code, String manufacturer, int yearOfProduction, int price, String color, String engine, int numberOfSeats) {
        super(code, manufacturer, yearOfProduction, price, color);
        this.engine = engine;
        this.numberOfSeats = numberOfSeats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return super.toString() + '\t' +
               engine + '\t' +
               numberOfSeats;
    }
}
