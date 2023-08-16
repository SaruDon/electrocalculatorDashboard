package com.example.electrocalculatordashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7402 extends AppCompatActivity {
    ImageView imageView;
    private Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7402);
        imageView =findViewById(R.id.imageView8);
        imageView =findViewById(R.id.imageView6);
        textView =findViewById(R.id.textView11);
        textView =findViewById(R.id.textView12);
        textView =findViewById(R.id.textView13);
        button = findViewById(R.id.button15);

    }
    public void next7402(View g) {
        Toast.makeText(MainActivity7402.this, "IC7402 truth table", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivitynext7402.class);
        startActivity(intent);
    }
}