package com.example.electrocalculatordashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityIC7432 extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ic7432);
        imageView = findViewById(R.id.imageView14);
        imageView = findViewById(R.id.imageView15);
        textView = findViewById(R.id.textView27);
        textView = findViewById(R.id.textView29);
        textView = findViewById(R.id.textView30);
        button = findViewById(R.id.button20);
    }

    public void next7432(View i) {
        Toast.makeText(MainActivityIC7432.this, "IC7432 truth table", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivitynext7432.class);
        startActivity(intent);
    }
}