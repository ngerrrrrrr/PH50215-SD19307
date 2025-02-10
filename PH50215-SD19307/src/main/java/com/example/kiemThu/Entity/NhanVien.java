package com.example.kiemThu.Entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {
    private int id;
    private String hoTen;
    private String email;
    private String chucVu;
}

