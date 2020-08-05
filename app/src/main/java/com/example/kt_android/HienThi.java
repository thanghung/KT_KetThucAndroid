package com.example.kt_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HienThi extends AppCompatActivity {

    TextView txtShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_thi);

        txtShow = (TextView) findViewById(R.id.txtShow);

        //Lấy dữ liệu
        Intent intent = getIntent();
        txtShow.setText(intent.getStringExtra("SoLe"));
    }

    public void Back(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        txtShow.setText("");
    }
}