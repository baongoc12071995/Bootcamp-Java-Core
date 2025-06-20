import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    private ArrayList<SinhVien> danhSach = new ArrayList<>();

    // Tạo dữ liệu giả
    public void taoDuLieuGia() {
        danhSach.add(new SinhVien("Nguyen Van A", "SV001", 9, 8.5, 7));
        danhSach.add(new SinhVien("Tran Thi B", "SV002", 4, 5, 5));
        danhSach.add(new SinhVien("Le Van C", "SV003", 6, 7, 8));
        danhSach.add(new SinhVien("Pham Thi D", "SV004", 9.5, 9.5, 10));
        danhSach.add(new SinhVien("Vo Van E", "SV005", 3, 4, 4.5));
    }

    // Nhập thủ công
    public void nhapSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số lượng SV muốn nhập: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            System.out.print("Tên: ");
            String ten = sc.nextLine();
            System.out.print("Mã SV: ");
            String ma = sc.nextLine();
            System.out.print("Điểm Toán: ");
            double toan = Double.parseDouble(sc.nextLine());
            System.out.print("Điểm Lý: ");
            double ly = Double.parseDouble(sc.nextLine());
            System.out.print("Điểm Hóa: ");
            double hoa = Double.parseDouble(sc.nextLine());

            danhSach.add(new SinhVien(ten, ma, toan, ly, hoa));
        }
    }

    public void inDanhSach() {
        System.out.println("== DANH SÁCH SINH VIÊN ==");
        for (SinhVien sv : danhSach) {
            sv.hienThi();
        }
    }

    public void inSinhVienDiemCaoNhat() {
        if (danhSach.isEmpty()) return;

        double max = danhSach.get(0).getDiemTB();
        for (SinhVien sv : danhSach) {
            if (sv.getDiemTB() > max) {
                max = sv.getDiemTB();
            }
        }

        System.out.println("\n== SINH VIÊN CÓ ĐIỂM TB CAO NHẤT ==");
        for (SinhVien sv : danhSach) {
            if (sv.getDiemTB() == max) {
                sv.hienThi();
            }
        }
    }

    public void inSinhVienYeu() {
        System.out.println("\n== DANH SÁCH SINH VIÊN YẾU ==");
        for (SinhVien sv : danhSach) {
            if (sv.getDiemTB() < 5) {
                sv.hienThi();
            }
        }
    }

    public void timTheoTen(String tenCanTim) {
        System.out.println("\n== KẾT QUẢ TÌM KIẾM THEO TÊN: " + tenCanTim + " ==");
        for (SinhVien sv : danhSach) {
            if (sv.getTen().toLowerCase().contains(tenCanTim.toLowerCase())) {
                sv.hienThi();
            }
        }
    }

    public void timTheoMa(String maCanTim) {
        System.out.println("\n== KẾT QUẢ TÌM KIẾM THEO MÃ: " + maCanTim + " ==");
        for (SinhVien sv : danhSach) {
            if (sv.getMaSV().equalsIgnoreCase(maCanTim)) {
                sv.hienThi();
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
    }

    public void xoaTheoMa(String maXoa) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSV().equalsIgnoreCase(maXoa)) {
                danhSach.remove(i);
                System.out.println("Đã xoá sinh viên có mã: " + maXoa);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên để xoá.");
    }
}
