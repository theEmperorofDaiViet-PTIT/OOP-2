package friendly_2.q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Management implements Functional{

    private List<Transport> transportList;

    private Scanner sc = new Scanner(System.in);

    public Management() {
        this.transportList = new ArrayList<>();
    }

    @Override
    public Transport addTransport() {
        System.out.print("Nhap ma theo dinh dang 2 chu - 3 so: ");
        String code;
        String codeRegex = "^[A-Za-z]{2}\\d{3}$";
        while(true) {
            code = sc.nextLine();
            if(code.matches(codeRegex)) {
                break;
            }
            System.out.println("Khong dung dinh dang. Vui long nhap lai!");
        }
        System.out.print("Nhap hang san xuat, khong chua ky tu dac biet va khoang trang: ");
        String manufacturer;
        String manufacturerRegex = "^\\w+$";
        while(true) {
            manufacturer = sc.nextLine();
            if(manufacturer.matches(manufacturerRegex)) {
                break;
            }
            System.out.println("Khong dung dinh dang. Vui long nhap lai!");
        }
        System.out.print("Nhap nam san xuat (4 chu so): ");
        String yearOfProduction;
        String yearOfProductionRegex = "^\\d{4}$";
        while(true) {
            yearOfProduction = sc.nextLine();
            if(yearOfProduction.matches(yearOfProductionRegex)) {
                break;
            }
            System.out.println("Khong dung dinh dang. Vui long nhap lai!");
        }
        String price = sc.nextLine();
        String color = sc.nextLine();
        return new Transport(code, manufacturer, Integer.parseInt(yearOfProduction), Double.parseDouble(price), color);
    }

    @Override
    public void addCar() {
        Car car = (Car) addTransport();
        String engine = sc.nextLine();
        String numberOfSeats = sc.nextLine();

        car.setEngine(engine);
        car.setNumberOfSeats(Integer.parseInt(numberOfSeats));
        this.transportList.add(car);
    }

    @Override
    public void addMotorbike() {
        Motorbike motorbike = (Motorbike) addTransport();
        String power = sc.nextLine();

        motorbike.setPower(Double.parseDouble(power));
        this.transportList.add(motorbike);
    }

    @Override
    public void addTruck() {
        Truck truck = (Truck) addTransport();
        String capacity = sc.nextLine();

        truck.setCapacity(Double.parseDouble(capacity));
        this.transportList.add(truck);
    }

    @Override
    public void findAll() {
        int count = 0;
        System.out.println("Danh sach O to:");
        int countCar = 0;
        for(Transport t: transportList) {
            count++;
            if(t instanceof Car) {
                System.out.println(t);
                countCar++;
            }
        }
        System.out.println("-----------------");
        System.out.println("Tong: " + countCar + "o to");
        System.out.println("----------------------------");

        System.out.println("Danh sach Xe may:");
        int countMotorbike = 0;
        for(Transport t: transportList) {
            if(t instanceof Motorbike) {
                System.out.println(t);
                countMotorbike++;
            }
        }
        System.out.println("-----------------");
        System.out.println("Tong: " + countMotorbike + "xe may");
        System.out.println("----------------------------");

        System.out.println("Danh sach Xe tai:");
        int countTruck = 0;
        for(Transport t: transportList) {
            if(t instanceof Truck) {
                System.out.println(t);
                countTruck++;
            }
        }
        System.out.println("-----------------");
        System.out.println("Tong: " + countTruck + "xe tai");
        System.out.println("----------------------------");

        System.out.println("Tong: " + count + "phuong tien");
        System.out.println("----------------------------");
    }

    public void findByField() {

    }
}
