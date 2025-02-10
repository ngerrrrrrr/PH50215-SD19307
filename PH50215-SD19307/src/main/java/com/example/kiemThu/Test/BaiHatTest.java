package com.example.kiemThu.Test;
package com.example.kiemThu.Test;

import com.example.kiemThu.Entity.BaiHat;
import com.example.kiemThu.Service.BaiHatService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BaiHatTest {

    private BaiHatService service;

    @BeforeE
    public void setup() {
        service = new BaiHatService();
    }

    @Test
    public void testThemBaiHatHopLe() {
        BaiHat bh = new BaiHat("1", "Tinh ca", "Ca Si A", 200, "Nhac Si B");
        service.themBaiHat(bh);
        assertEquals(1, service.layTatCa().size());
    }

    @Test
    public void testXoaBaiHatHopLe() {
        BaiHat bh = new BaiHat("1", "Tinh ca", "Ca Si A", 200, "Nhac Si B");
        service.themBaiHat(bh);
        service.xoaBaiHat("1");
        assertEquals(0, service.layTatCa().size());
    }
}

