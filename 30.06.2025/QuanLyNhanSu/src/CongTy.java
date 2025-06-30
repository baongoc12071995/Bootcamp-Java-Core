import java.util.*;

public class CongTy {
    private String tenCongTy;
    private String maSoThue;
    private double doanhThuThang;
    private List<NhanSu> danhSachNhanSu = new ArrayList<>();

    public void setThongTinCongTy(String ten, String mst, double doanhThu) {
        this.tenCongTy = ten;
        this.maSoThue = mst;
        this.doanhThuThang = doanhThu;
    }

    public void themNhanSu(NhanSu ns) {
        danhSachNhanSu.add(ns);
    }

    public void xoaNhanSu(String maSo) {
        Iterator<NhanSu> it = danhSachNhanSu.iterator();
        while (it.hasNext()) {
            NhanSu ns = it.next();
            if (ns.getMaSo().equals(maSo)) {
                if (ns instanceof TruongPhong) {
                    for (NhanSu nv : danhSachNhanSu) {
                        if (nv instanceof NhanVienThuong) {
                            NhanVienThuong nvt = (NhanVienThuong) nv;
                            if (nvt.getTruongPhongQuanLy() == ns) {
                                nvt.setTruongPhongQuanLy(null);
                            }
                        }
                    }
                }
                it.remove();
                break;
            }
        }
    }

    public void phanBoNhanVien(String maNV, String maTP) {
        NhanVienThuong nv = null;
        TruongPhong tp = null;
        for (NhanSu ns : danhSachNhanSu) {
            if (ns.getMaSo().equals(maNV) && ns instanceof NhanVienThuong)
                nv = (NhanVienThuong) ns;
            if (ns.getMaSo().equals(maTP) && ns instanceof TruongPhong)
                tp = (TruongPhong) ns;
        }
        if (nv != null && tp != null) {
            nv.setTruongPhongQuanLy(tp);
        }
    }

    public void xuatThongTin() {
        System.out.println("STT\tMã\tHọ tên\tSĐT\tSố ngày\tLương/ngày\tLương\tThông tin thêm");
        int i = 1;
        for (NhanSu ns : danhSachNhanSu) {
            System.out.println(i++ + "\t" + ns.toString());
        }
    }

    public double tongLuong() {
        return danhSachNhanSu.stream().mapToDouble(NhanSu::tinhLuong).sum();
    }

    public void tinhThuNhapGiamDoc() {
        double loiNhuan = doanhThuThang - tongLuong();
        for (NhanSu ns : danhSachNhanSu) {
            if (ns instanceof GiamDoc) {
                GiamDoc gd = (GiamDoc) ns;
                System.out.println("Giám đốc " + gd.getHoTen() + ": Thu nhập = " + gd.tinhThuNhap(loiNhuan));
            }
        }
    }

    public GiamDoc timGiamDocCoPhanNhieuNhat() {
        return danhSachNhanSu.stream()
            .filter(ns -> ns instanceof GiamDoc)
            .map(ns -> (GiamDoc) ns)
            .max(Comparator.comparingDouble(GiamDoc::getCoPhan))
            .orElse(null);
    }
}
