package friendly_2.q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Management management = new Management();

        while(true) {
            System.out.println("----------MENU----------");

            System.out.println("0. Thoat");
            System.out.println("------------------------");

            Scanner sc = new Scanner(System.in);
            System.out.print("Chon mot chuc nang: ");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 0: {
                    System.out.println("BYE!!!");
                    System.exit(0);
                }
                case 1: {
                    System.out.println("----------Loai phuong tien----------");
                    System.out.println("1. O to");
                    System.out.println("2. Xe may");
                    System.out.println("3. Xe tai");
                    System.out.println("------------------------------------");

                    System.out.print("Chon mot phuong tien: ");
                    int type = Integer.parseInt(sc.nextLine());
                    switch (type) {
                        case 1:
                            management.addCar();
                            break;
                        case 2:
                            management.addMotorbike();
                            break;
                        case 3:
                            management.addTruck();
                            break;
                    }
                    break;
                }

                case 2: {
                    management.findAll();
                }
            }
        }
    }
}
