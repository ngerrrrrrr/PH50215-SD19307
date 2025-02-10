package com.example.kiemthunangcao;

public class BaiTap {
    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static int tinhHieu(int a, int b) {
        return a - b;
    }

    public static int tinhTich(int a, int b) {
        return a * b;
    }

    public static double tinhThuong(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Số chia không được bằng 0");
        }
        return (double) a / b;
    }

    public static double tinhTrungBinhCong(int a, int b) {
        return (double) (a + b) / 2;
    }

    public static int tinhTongSoChan(int[] arr){
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int tinhTongSoNguyen(int[] arr){
        int sum = 0;
        for (int i = 0;i < arr.length;i++){
            if(arr[i] == (int)arr[i]){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int tinhTongSoLe(int[] arr){
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void kiemTraSoNguyenAm(int[] arr){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < 0){
                System.out.println("So " + arr[i] + "la so nguyen am");
            }
        }
    }
}
