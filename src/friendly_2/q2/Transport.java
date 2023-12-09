package friendly_2.q2;

public class Transport {

    private String code;

    private String manufacturer;

    private int yearOfProduction;

    private double price;

    private String color;

    public Transport() {

    }

    public Transport(String code, String manufacturer, int yearOfProduction, double price, String color) {
        this.code = code;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.color = color;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return code + '\t' +
               manufacturer + '\t' +
               yearOfProduction + '\t' +
               price + '\t' +
               color + '\t';
    }
}
