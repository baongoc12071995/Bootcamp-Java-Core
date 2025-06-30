import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CongTy congTy = new CongTy();
        int choice;

        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Nhập thông tin công ty");
            System.out.println("2. Thêm nhân sự");
            System.out.println("3. Xóa nhân sự");
            System.out.println("4. Phân bổ nhân viên vào trưởng phòng");
            System.out.println("5. Xuất thông tin toàn bộ nhân sự");
            System.out.println("6. Tính tổng lương");
            System.out.println("7. Tính thu nhập từng giám đốc");
            System.out.println("8. Tìm giám đốc cổ phần cao nhất");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Tên công ty: ");
                    String ten = sc.nextLine();
                    System.out.print("Mã số thuế: ");
                    String mst = sc.nextLine();
                    System.out.print("Doanh thu tháng: ");
                    double dt = sc.nextDouble();
                    congTy.setThongTinCongTy(ten, mst, dt);
                    break;
                case 2:
                    System.out.print("Loại (1-NV, 2-TP, 3-GĐ): ");
                    int loai = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Mã: ");
                    String ma = sc.nextLine();
                    System.out.print("Tên: ");
                    String hoten = sc.nextLine();
                    System.out.print("SĐT: ");
                    String sdt = sc.nextLine();
                    System.out.print("Số ngày làm: ");
                    int ngay = sc.nextInt();
                    if (loai == 1)
                        congTy.themNhanSu(new NhanVienThuong(ma, hoten, sdt, ngay));
                    else if (loai == 2)
                        congTy.themNhanSu(new TruongPhong(ma, hoten, sdt, ngay));
                    else {
                        System.out.print("Cổ phần (%): ");
                        double cp = sc.nextDouble();
                        congTy.themNhanSu(new GiamDoc(ma, hoten, sdt, ngay, cp));
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã nhân sự cần xóa: ");
                    String max = sc.nextLine();
                    congTy.xoaNhanSu(max);
                    break;
                case 4:
                    System.out.print("Mã nhân viên: ");
                    String manv = sc.nextLine();
                    System.out.print("Mã trưởng phòng: ");
                    String matp = sc.nextLine();
                    congTy.phanBoNhanVien(manv, matp);
                    break;
                case 5:
                    congTy.xuatThongTin();
                    break;
                case 6:
                    System.out.println("Tổng lương: " + congTy.tongLuong());
                    break;
                case 7:
                    congTy.tinhThuNhapGiamDoc();
                    break;
                case 8:
                    GiamDoc gd = congTy.timGiamDocCoPhanNhieuNhat();
                    if (gd != null)
                        System.out.println("GĐ cổ phần cao nhất: " + gd.getHoTen() + " - " + gd.getCoPhan() + "%");
                    else
                        System.out.println("Chưa có giám đốc.");
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }
}
