package friendly_2.q1;

import java.util.*;

public class PhoneBook implements Functional {

    private List<PhoneNumber> phoneNumberList;

    private Scanner sc = new Scanner(System.in);

    public PhoneBook() {
        this.phoneNumberList = new ArrayList<>();
    }

    @Override
    public void addNewPhoneNumber() {
        String regex = "^\\d{3,4}-\\d+$";
        String phone;
        String areaCode;
        String phoneNumber;
        System.out.println("Nhap so dien thoai trong nuoc theo dinh dang 024-36407515 hoac 0227-3821213");
        while(true) {
            phone = sc.nextLine();
            if(phone.matches(regex)) {
                break;
            }
            System.err.println("Khong dung dinh dang. Vui long nhap lai!");
        }
        areaCode = phone.split("-")[0];
        phoneNumber = phone.split("-")[1];
        phoneNumberList.add(new PhoneNumber(areaCode, phoneNumber));
    }

    @Override
    public void addIntlPhoneNumber() {
        String regex = "^\\d{2,3}-\\d{2,3}-\\d+$";
        String phone;
        String countryCode;
        String areaCode;
        String phoneNumber;
        System.out.println("Nhap so dien thoai quoc te theo dinh dang 84-24-36407515");
        while(true) {
            phone = sc.nextLine();
            if(phone.matches(regex)) {
                break;
            }
            System.err.println("Khong dung dinh dang. Vui long nhap lai!");
        }
        countryCode = phone.split("-")[0];
        areaCode = "0" + phone.split("-")[1];
        phoneNumber = phone.split("-")[2];
        phoneNumberList.add(new IntlPhoneNumber(areaCode, phoneNumber, countryCode));
    }

    @Override
    public void findByAreaCode() {
        System.out.print("Nhap ma vung can tim: ");
        String areaCode = sc.nextLine();
        boolean found = false;
        for(PhoneNumber p: phoneNumberList) {
            if(p.getAreaCode().equals(areaCode.strip())) {
                found = true;
                System.out.println(p);
            }
        }
        if(!found) {
            System.out.println("Khong tim thay so dien thoai nao!");
        }
    }

    @Override
    public void findAll() {
        System.out.println("Tat ca cac so dien thoai:");
        for(PhoneNumber p: phoneNumberList) {
            System.out.println(p);
        }
    }

    @Override
    public void findAllPhoneNumber() {
        System.out.println("Tat ca cac so dien thoai trong nuoc");
        for(PhoneNumber p: phoneNumberList) {
            if(!(p instanceof IntlPhoneNumber)) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void findAllIntlPhoneNumber() {
        System.out.println("Tat ca cac so dien thoai quoc te");
        for(PhoneNumber p: phoneNumberList) {
            if(p instanceof IntlPhoneNumber) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void countByAreaCode() {
        Map<String, Integer> count = new LinkedHashMap();
        for(PhoneNumber p: phoneNumberList) {
            if(count.containsKey(p.getAreaCode())) {
                count.put(p.getAreaCode(), count.get(p.getAreaCode()) + 1);
            }
            else {
                count.put(p.getAreaCode(), 1);
            }
        }
        for(Map.Entry<String, Integer> entry: count.entrySet()) {
            System.out.println("Ma vung " + entry.getKey() + " : " + entry.getValue() + " so dien thoai");
        }
    }

    @Override
    public void findByEnd() {
        System.out.print("Nhap duoi: ");
        String end = sc.nextLine();
        String regex = "^.*" + end + "$";
        boolean found = false;
        for(PhoneNumber p: phoneNumberList) {
            if(p.toString().matches(regex)) {
                System.out.println(p);
                found = true;
            }
        }
        if(!found) {
            System.out.println("Khong tim thay so dien thoai nao!");
        }
    }

    @Override
    public void sort() {
        Collections.sort(this.phoneNumberList);
        findAll();
    }
}
