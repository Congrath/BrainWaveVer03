package com.example.brainwavever02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        Button change_to_main=(Button) this.findViewById(R.id.change_to_main);
        change_to_main.setOnClickListener((View view) ->{
            Intent intent = new Intent(this, MainActivity.class);
            this.startActivity(intent);
        });

        Button change_to_history=(Button) this.findViewById(R.id.change_to_history);
        change_to_history.setOnClickListener((View view) ->{
            Intent intent = new Intent(this, History.class);
            this.startActivity(intent);
        });
    }
}