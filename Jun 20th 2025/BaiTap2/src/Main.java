import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        Scanner sc = new Scanner(System.in);

        // Dữ liệu mẫu
        ql.taoDuLieuGia();

        int chon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. In danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sinh viên điểm cao nhất");
            System.out.println("4. Sinh viên yếu");
            System.out.println("5. Tìm theo tên");
            System.out.println("6. Tìm theo mã");
            System.out.println("7. Xoá theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> ql.inDanhSach();
                case 2 -> ql.nhapSinhVien();
                case 3 -> ql.inSinhVienDiemCaoNhat();
                case 4 -> ql.inSinhVienYeu();
                case 5 -> {
                    System.out.print("Nhập tên cần tìm: ");
                    String ten = sc.nextLine();
                    ql.timTheoTen(ten);
                }
                case 6 -> {
                    System.out.print("Nhập mã cần tìm: ");
                    String ma = sc.nextLine();
                    ql.timTheoMa(ma);
                }
                case 7 -> {
                    System.out.print("Nhập mã cần xoá: ");
                    String ma = sc.nextLine();
                    ql.xoaTheoMa(ma);
                }
                case 0 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (chon != 0);
    }
}
