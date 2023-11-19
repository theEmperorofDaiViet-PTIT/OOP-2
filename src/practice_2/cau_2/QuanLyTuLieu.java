package practice_2.cau_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyTuLieu {

    private List<TuLieu> list;

    public QuanLyTuLieu() {
        list = new ArrayList<>();
    }

    public List<TuLieu> getList() {
        return list;
    }

    public void setList(List<TuLieu> list) {
        this.list = list;
    }

    public void nhapBao(Scanner in) {
        String ten = in.nextLine();
        String tenNhaXB = in.nextLine();
        String ngay = in.nextLine();
        String gia = in.nextLine();
        String soLuong = in.nextLine();
        list.add(new Bao(ten, tenNhaXB, ngay, Double.parseDouble(gia), Integer.parseInt(soLuong)));
    }

    public void nhapSachHoc(Scanner in) {
        String ten = in.nextLine();
        String tenTG = in.nextLine();
        String soTrang = in.nextLine();
        String tenNhaXB = in.nextLine();
        String gia = in.nextLine();
        String soLuong = in.nextLine();
        list.add(new SachHoc(ten, tenTG, Integer.parseInt(soTrang), tenNhaXB, Double.parseDouble(gia), Integer.parseInt(soLuong)));
    }

    public void out() {
        for(TuLieu t: list) {
            System.out.println(t);
        }
    }
}