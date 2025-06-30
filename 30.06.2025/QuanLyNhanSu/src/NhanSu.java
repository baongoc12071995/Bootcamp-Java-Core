public abstract class NhanSu {
    protected String maSo;
    protected String hoTen;
    protected String soDienThoai;
    protected int soNgayLamViec;
    protected double luongMotNgay;

    public NhanSu(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, double luongMotNgay) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soNgayLamViec = soNgayLamViec;
        this.luongMotNgay = luongMotNgay;
    }

    public abstract double tinhLuong();

    public String getMaSo() { return maSo; }

    public String getHoTen() { return hoTen; }

    public double getLuongMotNgay() { return luongMotNgay; }

    public String toString() {
        return String.format("%s\t%s\t%s\t%d\t%.2f\t%.2f",
                maSo, hoTen, soDienThoai, soNgayLamViec, luongMotNgay, tinhLuong());
    }
}
