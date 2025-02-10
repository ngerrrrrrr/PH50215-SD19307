package com.example.kiemThu.Entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
    private int maSV;
    private String tenSV;
    private String lop;
    private String khoaHoc;
    private String monHoc;
}