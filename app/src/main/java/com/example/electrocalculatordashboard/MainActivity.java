package com.example.electrocalculatordashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init views
        initViews();
        //setup listeners
        setupListeners();
    }

    private void initViews() {
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
    }

    private void setupListeners() {
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    public void openActivity() {
        //Toast.makeText(MainActivity.this, "Resistance calculator selected", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openAct() {
       // Toast.makeText(MainActivity.this, "capacitance calculator selected", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void openOut() {
      // Toast.makeText(MainActivity.this, "All about IC selected", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                //launch resistance activity
                openActivity();
                break;
            case R.id.button2:
                //launch capicitance activity
                openAct();
                break;
            case R.id.button3:
                //launch all about IC activity
                openOut();
                break;
            default:
                break;
        }
    }
}