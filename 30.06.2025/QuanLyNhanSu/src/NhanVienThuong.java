public class NhanVienThuong extends NhanSu {
    private TruongPhong truongPhongQuanLy;

    public NhanVienThuong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec, 100);
    }

    @Override
    public double tinhLuong() {
        return luongMotNgay * soNgayLamViec;
    }

    public void setTruongPhongQuanLy(TruongPhong tp) {
        if (this.truongPhongQuanLy != null) {
            this.truongPhongQuanLy.giamNhanVien();
        }
        this.truongPhongQuanLy = tp;
        if (tp != null) {
            tp.tangNhanVien();
        }
    }

    public TruongPhong getTruongPhongQuanLy() {
        return truongPhongQuanLy;
    }

    @Override
    public String toString() {
        String tenTP = (truongPhongQuanLy != null) ? truongPhongQuanLy.getHoTen() : "NULL";
        return super.toString() + "\tTPQL: " + tenTP;
    }
}
