package com.example.kiemThu.Test;

import com.example.kiemThu.Entity.SinhVien;
import com.example.kiemThu.Service.SinhVienService;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SinhVienTest {

    private SinhVienService service;

    @BeforeEach
    public void setup() {
        service = new SinhVienService();
    }

    @Test
    public void testThemSinhVienHopLe() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A1", "CNTT", "Lap trinh Java");
        service.themSinhVien(sv);
        assertEquals(1, service.layTatCa().size());
    }

    @Test
    public void testCapNhatSinhVienHopLe() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A1", "CNTT", "Lap trinh Java");
        service.themSinhVien(sv);
        SinhVien svMoi = new SinhVien(1, "Nguyen Van B", "12A2", "CNTT", "Lap trinh C++");
        service.capNhatSinhVien(1, svMoi);
        assertEquals("Nguyen Van B", service.layTatCa().get(0).getTenSV());
    }

    @Test
    public void testXoaSinhVienHopLe() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A1", "CNTT", "Lap trinh Java");
        service.themSinhVien(sv);
        service.xoaSinhVien(1);
        assertEquals(0, service.layTatCa().size());
    }

    @Test
    public void testTimKiemSinhVienHopLe() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A1", "CNTT", "Lap trinh Java");
        service.themSinhVien(sv);
        SinhVien timThay = service.timKiemSinhVien(1);
        assertNotNull(timThay);
        assertEquals("Nguyen Van A", timThay.getTenSV());
    }

    @Test
    public void testTimKiemSinhVienKhongTonTai() {
        SinhVien timThay = service.timKiemSinhVien(99);
        assertNull(timThay);
    }
}

