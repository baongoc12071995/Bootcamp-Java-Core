public class SinhVien {
    private String ten;
    private String maSV;
    private double toan, ly, hoa;

    public SinhVien(String ten, String maSV, double toan, double ly, double hoa) {
        this.ten = ten;
        this.maSV = maSV;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double tinhDiemTrungBinh() {
        return (toan + ly + hoa) / 3.0;
    }

    public String xepLoai() {
        double dtb = tinhDiemTrungBinh();
        if (dtb >= 9) return "Xuất Sắc";
        else if (dtb >= 8) return "Giỏi";
        else if (dtb >= 7) return "Khá";
        else if (dtb >= 6) return "Trung Bình";
        else if (dtb >= 5) return "Yếu";
        else return "Kém";
    }

    public String getTen() { return ten; }
    public String getMaSV() { return maSV; }
    public double getDiemTB() { return tinhDiemTrungBinh(); }

    public void hienThi() {
        System.out.printf("Tên: %-20s | Mã SV: %-10s | ĐTB: %.2f | Xếp loại: %s\n",
                ten, maSV, getDiemTB(), xepLoai());
    }
}
