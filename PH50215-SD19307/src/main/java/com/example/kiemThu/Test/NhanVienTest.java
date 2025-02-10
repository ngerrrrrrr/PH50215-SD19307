package com.example.kiemThu.Test;

import com.example.kiemThu.Service.NhanVienService;
import com.example.kiemThu.Entity.NhanVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NhanVienTest {

    private NhanVienService service;

    @BeforeEach
    public void setup() {
        service = new NhanVienService();
    }

    @Test
    public void testThemNhanVienHopLe() {
        NhanVien nv = new NhanVien(1, "Tran Van A", "a@example.com", "Ke Toan");
        service.themNhanVien(nv);
        assertEquals(1, service.layTatCa().size());
    }

    @Test
    public void testCapNhatNhanVienHopLe() {
        NhanVien nv = new NhanVien(1, "Tran Van A", "a@example.com", "Ke Toan");
        service.themNhanVien(nv);
        NhanVien nvMoi = new NhanVien(1, "Tran Van B", "b@example.com", "Nhan Su");
        service.capNhatNhanVien(1, nvMoi);
        assertEquals("Tran Van B", service.layTatCa().get(0).getHoTen());
    }

    @Test
    public void testXoaNhanVienHopLe() {
        NhanVien nv = new NhanVien(1, "Tran Van A", "a@example.com", "Ke Toan");
        service.themNhanVien(nv);
        service.xoaNhanVien(1);
        assertEquals(0, service.layTatCa().size());
    }

    @Test
    public void testTimKiemNhanVienHopLe() {
        NhanVien nv = new NhanVien(1, "Tran Van A", "a@example.com", "Ke Toan");
        service.themNhanVien(nv);
        NhanVien timThay = service.timKiemNhanVien(1);
        assertNotNull(timThay);
        assertEquals("Tran Van A", timThay.getHoTen());
    }

    @Test
    public void testTimKiemNhanVienKhongTonTai() {
        NhanVien timThay = service.timKiemNhanVien(99);
        assertNull(timThay);
    }
}