package com.example.kiemThu.Service;

import com.example.kiemThu.Entity.NhanVien;
import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private final List<NhanVien> danhSachNhanVien = new ArrayList<>();

    public void themNhanVien(NhanVien nv) {
        danhSachNhanVien.add(nv);
    }

    public void capNhatNhanVien(int id, NhanVien nhanVienMoi) {
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            if (danhSachNhanVien.get(i).getId() == id) {
                danhSachNhanVien.set(i, nhanVienMoi);
                return;
            }
        }
    }

    public void xoaNhanVien(int id) {
        danhSachNhanVien.removeIf(nv -> nv.getId() == id);
    }

    public NhanVien timKiemNhanVien(int id) {
        return danhSachNhanVien.stream()
                .filter(nv -> nv.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<NhanVien> layTatCa() {
        return new ArrayList<>(danhSachNhanVien);
    }
}
