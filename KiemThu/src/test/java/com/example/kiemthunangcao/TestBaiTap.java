package com.example.kiemthunangcao;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBaiTap {

//    Tinh Tong
    @Test
    public void testTinhTong_VungBien() {
        assertEquals(0, BaiTap.tinhTong(0, 0));
        assertEquals(-1, BaiTap.tinhTong(0, -1));
        assertEquals(1, BaiTap.tinhTong(0, 1));
    }

    @Test
    public void testTinhTong_TuongDuong() {
        assertEquals(100, BaiTap.tinhTong(50, 50));
        assertEquals(-100, BaiTap.tinhTong(-50, -50));
    }

    //Tinh Hieu
    @Test
    public void testTinhHieu_VungBien() {
        assertEquals(0, BaiTap.tinhHieu(0, 0));
        assertEquals(1, BaiTap.tinhHieu(1, 0));
        assertEquals(-1, BaiTap.tinhHieu(0, 1));
    }

    @Test
    public void testTinhHieu_TuongDuong() {
        assertEquals(50, BaiTap.tinhHieu(100, 50));
        assertEquals(-50, BaiTap.tinhHieu(-100, -50));
    }

    //Tinh Tich
    @Test
    public void testTinhTich_VungBien() {
        assertEquals(0, BaiTap.tinhTich(0, 100));
        assertEquals(-100, BaiTap.tinhTich(-10, 10));
        assertEquals(100, BaiTap.tinhTich(-10, -10));
    }

    @Test
    public void testTinhTich_TuongDuong() {
        assertEquals(2500, BaiTap.tinhTich(50, 50));
        assertEquals(-2500, BaiTap.tinhTich(-50, 50));
    }

    //Tinh Thuong
    @Test
    public void testTinhThuong_VungBien() {
        assertEquals(1.0, BaiTap.tinhThuong(10, 10));
        assertEquals(-1.0, BaiTap.tinhThuong(-10, 10));
        assertEquals(1.0, BaiTap.tinhThuong(-10, -10));
    }

    @Test
    public void testTinhThuong_TuongDuong() {
        assertEquals(2.0, BaiTap.tinhThuong(20, 10));
        assertEquals(-2.0, BaiTap.tinhThuong(-20, 10));
    }

    //Tinh Trung Binh Cong
    @Test
    public void testTinhTrungBinhCong_VungBien() {
        assertEquals(0.0, BaiTap.tinhTrungBinhCong(0, 0));
        assertEquals(5.0, BaiTap.tinhTrungBinhCong(0, 10));
        assertEquals(-5.0, BaiTap.tinhTrungBinhCong(-10, 0));
    }

    @Test
    public void testTinhTrungBinhCong_TuongDuong() {
        assertEquals(25.0, BaiTap.tinhTrungBinhCong(50, 0));
        assertEquals(0.0, BaiTap.tinhTrungBinhCong(-50, 50));
    }
}
