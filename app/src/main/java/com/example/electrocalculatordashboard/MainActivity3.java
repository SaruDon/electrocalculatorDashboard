package com.example.electrocalculatordashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    TextView textView;
    private Button button;
    ImageView imageView;
    TextInputLayout capacitor1;
    AutoCompleteTextView autoCompleteTextView;
    TextInputLayout capacitor2;
    AutoCompleteTextView autoCompleteTextView5;
    TextInputLayout capacitor3;
    AutoCompleteTextView autoCompleteTextView6;

    ArrayList<String> arrayList_season;
    ArrayAdapter<String> arrayAdapter_season;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        //box 1
        capacitor1=(TextInputLayout)findViewById(R.id.capacitor1);
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);

        arrayList_season=new ArrayList<>();
        arrayList_season.add("      1");
        arrayList_season.add("      2");
        arrayList_season.add("      3");
        arrayList_season.add("      4");
        arrayList_season.add("      5");
        arrayList_season.add("      6");
        arrayList_season.add("      7");
        arrayList_season.add("      8");
        arrayList_season.add("      9");
        arrayList_season.add("      0");

        arrayAdapter_season =new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,arrayList_season);
        autoCompleteTextView.setAdapter(arrayAdapter_season);

        autoCompleteTextView.setThreshold(1);


//box5

        capacitor2=(TextInputLayout)findViewById(R.id.capacitor2);
        autoCompleteTextView5=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView5);

        arrayList_season=new ArrayList<>();
        arrayList_season.add("      1");
        arrayList_season.add("      2");
        arrayList_season.add("      3");
        arrayList_season.add("      4");
        arrayList_season.add("      5");
        arrayList_season.add("      6");
        arrayList_season.add("      7");
        arrayList_season.add("      8");
        arrayList_season.add("      9");
        arrayList_season.add("      0");

        arrayAdapter_season =new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,arrayList_season);
        autoCompleteTextView5.setAdapter(arrayAdapter_season);

        autoCompleteTextView5.setThreshold(1);


//box3
        capacitor3=(TextInputLayout)findViewById(R.id.capacitor3);
        autoCompleteTextView6=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView6);

        arrayList_season=new ArrayList<>();
        arrayList_season.add("      1");
        arrayList_season.add("      2");
        arrayList_season.add("      3");
        arrayList_season.add("      4");
        arrayList_season.add("      5");
        arrayList_season.add("      6");
        arrayList_season.add("      7");
        arrayList_season.add("      8");
        arrayList_season.add("      9");
        arrayList_season.add("      0");

        arrayAdapter_season =new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,arrayList_season);
        autoCompleteTextView6.setAdapter(arrayAdapter_season);

        autoCompleteTextView6.setThreshold(1);

        //all text and img
        textView =findViewById(R.id.textView2);
        textView =findViewById(R.id.textView3);
        textView =findViewById(R.id.textView4);
        button =findViewById(R.id.button4);
        textView =findViewById(R.id.textView5);
        imageView=findViewById(R.id.imageView2);

    }
}