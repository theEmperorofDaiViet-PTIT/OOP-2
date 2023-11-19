package practice_2.cau_3;

import java.util.ArrayList;
import java.util.Comparator;
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

    public void out() {
        for(TuLieu t: list) {
            System.out.println(t);
        }
    }

    public void sapxepBaoTheoNgay(int parseInt) {
        List<Bao> baoList = new ArrayList<>();
        for(TuLieu t: list) {
            if(t instanceof Bao) {
                if(Integer.parseInt(((Bao) t).getNgay().split("/")[2]) == parseInt) {
                    baoList.add((Bao) t);
                }
            }
        }
        baoList.sort(Comparator.comparing((Bao bao) -> {
            return bao.getNgay().split("/")[1];
        }).thenComparing((Bao bao) -> {
            return bao.getNgay().split("/")[0];
        }));
        for(Bao t: baoList) {
            System.out.println(t);
        }
    }
}