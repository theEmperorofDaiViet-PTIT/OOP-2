package friendly_2.q2;

public class Motorbike extends Transport {

    private double power;

    public Motorbike() {

    }

    public Motorbike(String code, String manufacturer, int yearOfProduction, int price, String color, double power) {
        super(code, manufacturer, yearOfProduction, price, color);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + '\t' +
               power;
    }
}
