package com.example.kt_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editN;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editN = (EditText) findViewById(R.id.EditN);
        btnAdd = (Button) findViewById(R.id.btnShow);
    }

    public void  Show(View v)
    {
        try
        {
            int n = Integer.parseInt(editN.getText().toString()) ;
            String s = "";

            for(int i=1; i<=n ; i++)
                if(i%2!=0)
                    s += i + " ";

                //Tryền dữ liệu sang Acctivity khác
            Intent intent = new Intent(this, HienThi.class);
            intent.putExtra("SoLe",s);
            startActivity(intent);
            editN.setText("");
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this, "Hãy nhập số n", Toast.LENGTH_SHORT).show();
        }

    }
}