package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Set;

public class GantiPasswordActivity extends AppCompatActivity {

    private ImageView btn_back;
    private TextView ubahPasswordnya;
    private Intent back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganti_password);

        btn_back = findViewById(R.id.back_btn);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back = new Intent(GantiPasswordActivity.this, SettingActivity.class);
                startActivity(back);
            }
        });

        ubahPasswordnya = findViewById(R.id.konfirubahpass);
        ubahPasswordnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GantiPasswordActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });

    }

}