package com.example.hanbeo.rikkeisoft_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtTen;
    Button btnNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTen = (EditText) findViewById(R.id.edtTen);
        btnNhap = (Button) findViewById(R.id.btnNhap);
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("Ten", edtTen.getText().toString());
                intent.putExtra("HoTen", bundle);
                startActivity(intent);
            }
        });
    }
}
