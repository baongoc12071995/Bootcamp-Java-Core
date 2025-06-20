import java.util.Scanner;

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
        if (dtb >= 9) {
            return "Xuất Sắc";
        } else if (dtb >= 8) {
            return "Giỏi";
        } else if (dtb >= 7) {
            return "Khá";
        } else if (dtb >= 6) {
            return "Trung Bình";
        } else if (dtb >= 5) {
            return "Yếu";
        } else {
            return "Kém";
        }
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Mã SV: " + maSV);
        System.out.println("Điểm trung bình: " + String.format("%.2f", tinhDiemTrungBinh()));
        System.out.println("Xếp loại: " + xepLoai());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập mã sinh viên: ");
        String maSV = sc.nextLine();

        System.out.print("Nhập điểm Toán: ");
        double toan = sc.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        double ly = sc.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        double hoa = sc.nextDouble();

        SinhVien sv = new SinhVien(ten, maSV, toan, ly, hoa);

        System.out.println("\n== KẾT QUẢ ==");
        sv.hienThiThongTin();
    }
}