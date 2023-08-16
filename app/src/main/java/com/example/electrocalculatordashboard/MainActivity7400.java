package com.example.electrocalculatordashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7400 extends AppCompatActivity {
    ImageView imageView;
    private Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7400);
        imageView =findViewById(R.id.imageView5);
        imageView =findViewById(R.id.imageView4);
        textView =findViewById(R.id.textView7);
        textView =findViewById(R.id.textView8);
        textView =findViewById(R.id.textView9);
    }

    public void next7400(View t) {
        Toast.makeText(MainActivity7400.this, "Truth table of IC 7400", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivitynext7400 .class);
        startActivity(intent);
    }
}



