package com.example.brainwavever02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Button change_to_main=(Button) this.findViewById(R.id.change_to_main);
        change_to_main.setOnClickListener((View view) ->{
            Intent intent = new Intent(this, MainActivity.class);
            this.startActivity(intent);
        });

        Button change_to_setting=(Button) this.findViewById(R.id.change_to_setting);
        change_to_setting.setOnClickListener((View view) ->{
            Intent intent = new Intent(this, Settings.class);
            this.startActivity(intent);
        });
    }
}