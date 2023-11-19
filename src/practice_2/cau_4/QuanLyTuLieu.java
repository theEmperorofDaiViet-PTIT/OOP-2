package practice_2.cau_4;

import java.util.*;
import java.util.stream.Collectors;

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

    public void thongkeBao() {
        List<Bao> baoList = new ArrayList<>();
        for(TuLieu t: list) {
            if(t instanceof Bao) {
                baoList.add((Bao) t);
            }
        }
        Map<Integer, Long> thongke = baoList.stream().collect(Collectors.groupingBy(
                (Bao bao) -> {
                    return Integer.parseInt(bao.getNgay().split("/")[2]);
                }, Collectors.summingLong(Bao::getSoLuong)
        ));
        for(Map.Entry e: thongke.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}