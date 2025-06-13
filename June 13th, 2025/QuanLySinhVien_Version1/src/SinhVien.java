import java.util.Scanner;

public class SinhVien {
    // Thuộc tính
    String ten;
    String maSV;
    double diemToan;
    double diemLy;
    double diemHoa;

    // Hàm tính điểm trung bình
    public double tinhDiemTB() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    // Hàm xếp loại
    public String xepLoai() {
        double dtb = tinhDiemTB();
        if (dtb >= 9) {
            return "Xuất Sắc";
        } else if (dtb >= 8) {
            return "Giỏi";
        } else if (dtb >= 7) {
            return "Khá";
        } else if (dtb >= 6) {
            return "TB Khá";
        } else if (dtb >= 5) {
            return "Trung Bình";
        } else {
            return "Yếu";
        }
    }

    // Hàm nhập thông tin từ người dùng
    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập tên sinh viên: ");
        ten = scanner.nextLine();
        System.out.print("Nhập mã sinh viên: ");
        maSV = scanner.nextLine();
        System.out.print("Nhập điểm Toán: ");
        diemToan = scanner.nextDouble();
        System.out.print("Nhập điểm Lý: ");
        diemLy = scanner.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        diemHoa = scanner.nextDouble();
        scanner.nextLine(); // Xử lý dòng thừa
    }

    // Hàm hiển thị thông tin sinh viên
    public void hienThiThongTin() {
        System.out.printf("| %-15s | %-10s | %6.2f | %6.2f | %6.2f | %8.2f | %-10s |\n",
                          ten, maSV, diemToan, diemLy, diemHoa, tinhDiemTB(), xepLoai());
    }

    // Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinhVien sv = new SinhVien();
        sv.nhapThongTin(scanner);

        // In tiêu đề bảng
        System.out.println("\nKết quả:");
        System.out.printf("| %-15s | %-10s | %6s | %6s | %6s | %8s | %-10s |\n",
                          "Họ Tên", "Mã SV", "Toán", "Lý", "Hóa", "Điểm TB", "Xếp Loại");
        System.out.println("----------------------------------------------------------------------------------");
        sv.hienThiThongTin();

        scanner.close();
    }
}
