package com.example.electrocalculatordashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityIC7408 extends AppCompatActivity {
    ImageView imageView;
    private Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ic7408);
        imageView =findViewById(R.id.imageView14);
        imageView =findViewById(R.id.imageView15);
        textView =findViewById(R.id.textView24);
        textView =findViewById(R.id.textView25);
        textView =findViewById(R.id.textView28);
        button = findViewById(R.id.button16);
    }
    public void next7408(View s) {
        Toast.makeText(MainActivityIC7408.this, "IC7408 truth table", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivitynext7408.class);
        startActivity(intent);
    }
}