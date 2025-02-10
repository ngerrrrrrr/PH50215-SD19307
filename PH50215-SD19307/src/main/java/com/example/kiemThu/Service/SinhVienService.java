package com.example.kiemThu.Service;

import com.example.kiemThu.Entity.SinhVien;
import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private final List<SinhVien> danhSachSinhVien = new ArrayList<>();

    public void themSinhVien(SinhVien sv) {
        danhSachSinhVien.add(sv);
    }

    public void capNhatSinhVien(int maSV, SinhVien sinhVienMoi) {
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getMaSV() == maSV) {
                danhSachSinhVien.set(i, sinhVienMoi);
                return;
            }
        }
    }

    public void xoaSinhVien(int maSV) {
        danhSachSinhVien.removeIf(sv -> sv.getMaSV() == maSV);
    }

    public SinhVien timKiemSinhVien(int maSV) {
        return danhSachSinhVien.stream()
                .filter(sv -> sv.getMaSV() == maSV)
                .findFirst()
                .orElse(null);
    }

    public List<SinhVien> layTatCa() {
        return new ArrayList<>(danhSachSinhVien);
    }
}