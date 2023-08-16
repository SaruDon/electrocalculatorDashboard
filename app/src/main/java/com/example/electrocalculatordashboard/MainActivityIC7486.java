package com.example.electrocalculatordashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityIC7486 extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ic7486);
        imageView = findViewById(R.id.imageView14);
        imageView = findViewById(R.id.imageView15);
        textView = findViewById(R.id.textView32);
        textView = findViewById(R.id.textView33);
        textView = findViewById(R.id.textView35);
        button = findViewById(R.id.button18);

    }
    public void next7486(View k) {
        Toast.makeText(MainActivityIC7486.this, "IC7486 truth table", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivitynext7486.class);
        startActivity(intent);
    }
}