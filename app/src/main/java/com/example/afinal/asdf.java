package com.example.afinal;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class asdf extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asdf1);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Hells");
    }
}
