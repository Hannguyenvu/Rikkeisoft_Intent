package com.example.hanbeo.rikkeisoft_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {
    TextView txtHienTen;
    EditText edtQue, edtNgaySinh, edtGioiTinh, edtLop, edtKhoaHoc;
    Button btnChuyen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        txtHienTen = (TextView) findViewById(R.id.txtHienTen);
        edtQue = (EditText) findViewById(R.id.edtQue);
        edtNgaySinh = (EditText) findViewById(R.id.edtNgaySinh);
        edtGioiTinh = (EditText) findViewById(R.id.edtGioiTinh);
        edtLop = (EditText) findViewById(R.id.edtLop);
        edtKhoaHoc = (EditText) findViewById(R.id.edtKhoaHoc);
        btnChuyen = (Button) findViewById(R.id.btnChuyen);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentInfor = new Intent(StudentActivity.this, StudentInforActivity.class);
                Bundle bundleInfor = new Bundle();
                bundleInfor.putString("HoTen", txtHienTen.getText().toString() );
                bundleInfor.putString("Que", edtQue.getText().toString());
                bundleInfor.putString("NgaySinh", edtNgaySinh.getText().toString());
                bundleInfor.putString("GioiTinh", edtGioiTinh.getText().toString());
                bundleInfor.putString("Lop", edtLop.getText().toString());
                bundleInfor.putString("KhoaHoc", edtKhoaHoc.getText().toString());

                intentInfor.putExtra("Infor", bundleInfor);
                startActivity(intentInfor);
            }
        });


        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("HoTen");
        String name = bundle.getString("Ten");
        txtHienTen.setText(name);

    }
}
