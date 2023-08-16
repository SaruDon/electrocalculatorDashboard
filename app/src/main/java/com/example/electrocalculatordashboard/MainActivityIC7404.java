package com.example.electrocalculatordashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityIC7404 extends AppCompatActivity {
    ImageView imageView;
    private Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ic7404);
        imageView =findViewById(R.id.imageView11);
        imageView =findViewById(R.id.imageView10);
        textView =findViewById(R.id.textView19);
        textView =findViewById(R.id.textView21);
        textView =findViewById(R.id.textView22);
        button = findViewById(R.id.button14);
    }
    public void next7404(View g) {
        Toast.makeText(MainActivityIC7404.this, "IC7404 Truth table", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivitynext7404.class);
        startActivity(intent);
    }
}