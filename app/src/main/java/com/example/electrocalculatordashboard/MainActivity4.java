package com.example.electrocalculatordashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    ImageView imageView;
    private Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView =findViewById(R.id.textView6);
        button =findViewById(R.id.button6);
        button =findViewById(R.id.button7);
        button =findViewById(R.id.button8);
        button =findViewById(R.id.button9);
        button =findViewById(R.id.button10);
        button =findViewById(R.id.button11);

        imageView =findViewById(R.id.imageView3);
    }
    public void openIc(View m){
        Toast.makeText( this, "IC7400", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent( this, MainActivity7400.class);
        startActivity(intent);
    }

    public void openIc7402(View n){
        Toast.makeText( MainActivity4.this, "IC7402", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent( this, MainActivity7402.class);
        startActivity(intent);
    }
    public void openIc7404(View o) {
        Toast.makeText(MainActivity4.this, "IC7404", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivityIC7404.class);
        startActivity(intent);
    }
    public void openIc7408(View p) {
        Toast.makeText(MainActivity4.this, "IC7408", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivityIC7408.class);
        startActivity(intent);
    }
    public void openIc7432(View p) {
        Toast.makeText(MainActivity4.this, "IC7432", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivityIC7432.class);
        startActivity(intent);
    }
    public void openIc7486(View q) {
        Toast.makeText(MainActivity4.this, "IC7486", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivityIC7486.class);
        startActivity(intent);
    }
}