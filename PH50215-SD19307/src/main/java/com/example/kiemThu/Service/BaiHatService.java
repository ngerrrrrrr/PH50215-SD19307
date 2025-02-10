package com.example.kiemThu.Service;

import com.example.kiemThu.Entity.BaiHat;
import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    private final List<BaiHat> danhSachBaiHat = new ArrayList<>();

    public void themBaiHat(BaiHat bh) {
        danhSachBaiHat.add(bh);
    }

    public void xoaBaiHat(String id) {
        danhSachBaiHat.removeIf(bh -> bh.getId().equals(id));
    }

    public List<BaiHat> layTatCa() {
        return new ArrayList<>(danhSachBaiHat);
    }
}
