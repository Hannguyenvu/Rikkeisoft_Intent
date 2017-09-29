package com.example.hanbeo.rikkeisoft_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class StudentInforActivity extends AppCompatActivity {
    TextView txtHienTenInfor, txtQueQuan, txtNgaySinh, txtGioiTinh, txtLop, txtKhoaHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);
        txtHienTenInfor = (TextView) findViewById(R.id.txtHienTenInfor);
        txtQueQuan = (TextView) findViewById(R.id.txtQueQuan);
        txtNgaySinh = (TextView) findViewById(R.id.txtNgaySinh);
        txtGioiTinh = (TextView) findViewById(R.id.txtGioiTinh);
        txtLop = (TextView) findViewById(R.id.txtLop);
        txtKhoaHoc = (TextView) findViewById(R.id.txtKhoaHoc);


        Intent intentReceive = getIntent();
        Bundle bundleReceive = intentReceive.getBundleExtra("Infor");
        String name = bundleReceive.getString("HoTen");
        String que = bundleReceive.getString("Que");
        String ngaysinh = bundleReceive.getString("NgaySinh");
        String gioitinh = bundleReceive.getString("GioiTinh");
        String lop = bundleReceive.getString("Lop");
        String khoahoc = bundleReceive.getString("KhoaHoc");
        txtHienTenInfor.setText(name);
        txtQueQuan.setText(que);
        txtNgaySinh.setText(ngaysinh);
        txtGioiTinh.setText(gioitinh);
        txtLop.setText(lop);
        txtKhoaHoc.setText(khoahoc);

    }
}
