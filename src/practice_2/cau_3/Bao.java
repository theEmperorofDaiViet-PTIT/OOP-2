package practice_2.cau_3;

public class Bao extends TuLieu implements ITuLieu{

    private String ngay;

    private String ten;

    public Bao() {

    }

    public Bao(String ten, String tenNhaXB, String ngay, double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        super.setMa("" + (++id));
        for(int i = super.getMa().length(); i < 3; i++) {
            super.setMa("0" + super.getMa());
        }
        super.setMa(ten.substring(0, 1).toUpperCase() + super.getMa());
        this.ngay = ngay;
        this.ten = ten;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public double getGia() {
        int month = Integer.parseInt(this.ngay.split("/")[1]);
        double price = super.getGia();
        if(month == 1 || month == 2) {
            price *= 0.95;
        }
        if(super.getSoLuong() > 200) {
            price *= 0.95;
        }
        return price;
    }

    @Override
    public String toString() {
        return super.getMa() + " " + this.ten + " " + this.ngay + " " + super.getTenNhaXB() + " " + (int) this.getGia();
    }
}
