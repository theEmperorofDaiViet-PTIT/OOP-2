package friendly_2.q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        while(true){
            System.out.println("----------MENU----------");
            System.out.println("1. Them mot so dien thoai moi");
            System.out.println("2. Tim mot so dien thoai theo ma vung");
            System.out.println("3. Liet ke tat ca so dien thoai");
            System.out.println("4. Tinh tong so dien thoai theo tung vung");
            System.out.println("5. Tim kiem theo so duoi la...");
            System.out.println("6. Sap xep so dien thoai");

            System.out.println("0. Thoat");
            System.out.println("------------------------");

            Scanner sc = new Scanner(System.in);
            System.out.print("Chon mot chuc nang: ");
            int option = sc.nextInt();
            switch (option) {
                case 0: {
                    System.out.println("BYE!!!");
                    System.exit(0);
                }
                case 1: {
                    System.out.println("----------So dien thoai----------");
                    System.out.println("1. Trong nuoc");
                    System.out.println("2. Quoc te");
                    System.out.println("---------------------------------");

                    int type = sc.nextInt();
                    switch (type) {
                        case 1: {
                            phoneBook.addNewPhoneNumber();
                            break;
                        }
                        case 2: {
                            phoneBook.addIntlPhoneNumber();
                            break;
                        }
                    }
                    break;
                }

                case 2: {
                    phoneBook.findByAreaCode();
                    break;
                }

                case 3: {
                    System.out.println("----------So dien thoai----------");
                    System.out.println("1. Trong nuoc");
                    System.out.println("2. Quoc te");
                    System.out.println("3. Ca hai");
                    System.out.println("---------------------------------");

                    int type = sc.nextInt();
                    switch (type) {
                        case 1: {
                            phoneBook.findAllPhoneNumber();
                            break;
                        }
                        case 2: {
                            phoneBook.findAllIntlPhoneNumber();
                            break;
                        }
                        case 3: {
                            phoneBook.findAll();
                            break;
                        }
                    }
                    break;
                }

                case 4: {
                    phoneBook.countByAreaCode();
                    break;
                }

                case 5: {
                    phoneBook.findByEnd();
                    break;
                }

                case 6: {
                    phoneBook.sort();
                    break;
                }
            }
        }
    }
}
