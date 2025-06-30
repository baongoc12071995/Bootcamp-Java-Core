public class TruongPhong extends NhanSu {
    private int soNhanVienDuoiQuyen;

    public TruongPhong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec, 200);
    }

    public void tangNhanVien() {
        soNhanVienDuoiQuyen++;
    }

    public void giamNhanVien() {
        if (soNhanVienDuoiQuyen > 0) soNhanVienDuoiQuyen--;
    }

    public int getSoNhanVienDuoiQuyen() {
        return soNhanVienDuoiQuyen;
    }

    @Override
    public double tinhLuong() {
        return luongMotNgay * soNgayLamViec + 100 * soNhanVienDuoiQuyen;
    }

    @Override
    public String toString() {
        return super.toString() + "\tSố NV dưới quyền: " + soNhanVienDuoiQuyen;
    }
}
