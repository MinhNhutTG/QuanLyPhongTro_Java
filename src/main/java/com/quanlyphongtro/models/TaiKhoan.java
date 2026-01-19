package com.quanlyphongtro.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tai_khoan")
public class TaiKhoan {

    @Id
    @Column(name = "user_name", length = 30)
    private String userName;

    @Column(length = 255, nullable = false)
    private String passWord;

    @Column(name = "email_user", length = 100)
    private String emailUser;
}
