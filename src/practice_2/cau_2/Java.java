package practice_2.cau_2;

import java.util.Scanner;

public class Java {

//    public static void main(String[] args) {
//        Bao b=new Bao("Hoa hoc tro", "Tien Phong", "02/04/2023", 23000, 100);
//        System.out.println(b);
//        SachHoc s=new SachHoc("Toan cao cap", "Nhat tue", 120, "Giao duc", 80000, 300);
//        System.out.println(s);
//    }

    public static void main(String[] args) {
        QuanLyTuLieu q=new QuanLyTuLieu();
        Scanner in=new Scanner(System.in);
        q.nhapBao(in);
        q.nhapSachHoc(in);
//        INPUT:
//        nhi dong
//        thieu nhi
//        01/06/2023
//        23000
//        100
//        mua ha
//        Le an Thu
//        80
//        kim dong
//        90000
//        200
        q.out();
    }
}
