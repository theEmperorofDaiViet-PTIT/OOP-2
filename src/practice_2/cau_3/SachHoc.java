package practice_2.cau_3;

public class SachHoc extends TuLieu implements ITuLieu{

    private String ten;

    private String tenTG;

    private int soTrang;

    public SachHoc() {

    }

    public SachHoc(String ten, String tenTG, int soTrang, String tenNhaXB, double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        super.setMa("" + (++id));
        for(int i = super.getMa().length(); i < 3; i++) {
            super.setMa("0" + super.getMa());
        }
        super.setMa(ten.split("\\s")[0].toUpperCase() + super.getMa());
        this.ten = ten;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public double getGia() {
        double price = super.getGia();
        if(this.soTrang <= 300) {
            price *= 0.95;
        }
        else if(this.soTrang <= 500) {
            price *= 0.9;
        }
        else {
            price *= 0.05;
        }
        if(super.getSoLuong() > 500) {
            price *= 0.9;
        }
        return price;
    }

    @Override
    public String toString() {
        return super.getMa() + " " + this.ten + " " + super.getTenNhaXB() + " "
                + this.soTrang + " " + (int) this.getGia();
    }
}
