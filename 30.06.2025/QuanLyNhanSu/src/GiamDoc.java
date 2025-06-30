public class GiamDoc extends NhanSu {
    private double coPhan;

    public GiamDoc(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, double coPhan) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec, 300);
        if (coPhan < 0 || coPhan > 100)
            throw new IllegalArgumentException("Cổ phần phải từ 0 đến 100%");
        this.coPhan = coPhan;
    }

    public double getCoPhan() {
        return coPhan;
    }

    @Override
    public double tinhLuong() {
        return luongMotNgay * soNgayLamViec;
    }

    public double tinhThuNhap(double loiNhuan) {
        return tinhLuong() + (coPhan / 100) * loiNhuan;
    }

    @Override
    public String toString() {
        return super.toString() + "\tCổ phần: " + coPhan + "%";
    }
}
