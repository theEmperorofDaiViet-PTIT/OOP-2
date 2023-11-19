package practice_2.cau_1;

public class TuLieu implements ITuLieu{

    protected static int id = 0;

    private String ma;

    private String tenNhaXB;

    private double gia;

    private int soLuong;

    public TuLieu() {

    }

    public TuLieu(String tenNhaXB, double gia, int soLuong) {
        this.tenNhaXB = tenNhaXB;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    @Override
    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
