package com.example.kiemThu.Entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaiHat {
    private String id;
    private String ten;
    private String tenCaSi;
    private int doDai;
    private String tenNhacSi;
}