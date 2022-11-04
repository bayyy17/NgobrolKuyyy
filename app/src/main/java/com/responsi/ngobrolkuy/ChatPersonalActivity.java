package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ChatPersonalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_personal);

        ImageView back = findViewById(R.id.back_btn);
        ImageView send = findViewById(R.id.sendBtn);

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChatPersonalActivity.this, ChatPersonalActivity.class);
                startActivity(intent);
            }
        });

        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(ChatPersonalActivity.this, "Berhasil Dikirim", Toast.LENGTH_SHORT).show();
            }
        });
    }
}