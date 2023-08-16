package com.example.electrocalculatordashboard;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.electrocalculatordashboard.models.MultiplierModel;
import com.example.electrocalculatordashboard.models.ResistorModel;
import com.example.electrocalculatordashboard.models.ToleranceModel;
import com.example.electrocalculatordashboard.utils.PreferencesUtils;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    TextView textView, textView14, textView15;
    TextView textView16, textView17, textView23;
    private Button button;
    ImageView imageView;
    Spinner spinnerColor1;
    Spinner spinnerColor2;
    Spinner spinnerColor3;
    Spinner spinnerColor4;
    Spinner spinnerColor5;

    private Button button5;
    private String selectedColor = null;
    private String selectedMultiplier = null;
    private String selectedTolerance = null, selectedValue = null;

    ArrayList<ToleranceModel> arrayList_tolerance;
    ArrayAdapter<ToleranceModel> arrayAdapter_tolerance;

    ArrayList<ResistorModel> arrayList_season;
    ArrayAdapter<ResistorModel> arrayAdapter_season;

    ArrayList<MultiplierModel> arrayList_multiplier;
    ArrayAdapter<MultiplierModel> arrayAdapter_multiplier;

    private static final String TAG = "MainActivity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //clear all preference data
        PreferencesUtils.clearAllSharedPreferences(this);
        //initialize views
        initViews();
        //setup listeners
        setupListeners();
    }

    private void setupListeners() {
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Logical part
                Log.i(TAG, "submit button clicked");
               calculateFinalResult();
            };
        });
    }

    /**
     * Function to calculate final result
     */
    private void calculateFinalResult() {
        //get the values
        String firstBandVal = PreferencesUtils.getData("first_band", MainActivity2.this);
        String secondBandVal = PreferencesUtils.getData("second_band", MainActivity2.this);
        String thirdBandVal = PreferencesUtils.getData("third_band", MainActivity2.this);
        int multiplier = Integer.parseInt(PreferencesUtils.getData("multiplier", MainActivity2.this));
        String toleranceVal = PreferencesUtils.getData("tolerance", MainActivity2.this);
        int bandValue = Integer.parseInt(firstBandVal + secondBandVal + thirdBandVal);
        int result = bandValue * multiplier;

        //bind result to textview
        textView23.setText(result + " Ω " + toleranceVal);
        textView23.setVisibility(View.VISIBLE);
    }

    /**
     * Function to initialize views
     */
    private void initViews() {

        button5 = (Button) findViewById(R.id.button5);

        //1st box
        spinnerColor1 = (Spinner) findViewById(R.id.spinnerColor1);
        arrayAdapter_season = new ArrayAdapter<ResistorModel>(this, android.R.layout.simple_spinner_item, populateColorDropdownData());
        arrayAdapter_season.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerColor1.setAdapter(arrayAdapter_season);
        spinnerColor1.setOnItemSelectedListener(this);

        //2nd box
        spinnerColor2 = (Spinner) findViewById(R.id.spinnerColor2);
        arrayAdapter_season = new ArrayAdapter<ResistorModel>(this, android.R.layout.simple_spinner_item, populateColorDropdownData());
        arrayAdapter_season.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerColor2.setAdapter(arrayAdapter_season);
        spinnerColor2.setOnItemSelectedListener(this);

        //3rd Box
        spinnerColor3 = (Spinner) findViewById(R.id.spinnerColor3);
        arrayAdapter_season = new ArrayAdapter<ResistorModel>(this, android.R.layout.simple_spinner_item, populateColorDropdownData());
        arrayAdapter_season.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerColor3.setAdapter(arrayAdapter_season);
        spinnerColor3.setOnItemSelectedListener(this);

        spinnerColor4 = (Spinner) findViewById(R.id.spinnerColor4);
        arrayAdapter_multiplier = new ArrayAdapter<MultiplierModel>(this, android.R.layout.simple_spinner_item, populateMultiplierDropdownData());
        arrayAdapter_multiplier.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerColor4.setAdapter(arrayAdapter_multiplier);
        spinnerColor4.setOnItemSelectedListener(this);

        //5th box
        spinnerColor5 = (Spinner) findViewById(R.id.spinnerColor5);
        arrayAdapter_tolerance = new ArrayAdapter<ToleranceModel>(this, android.R.layout.simple_spinner_item, populateToleranceDropdownData());
        arrayAdapter_tolerance.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerColor5.setAdapter(arrayAdapter_tolerance);
        spinnerColor5.setOnItemSelectedListener(this);

        //other text and Images
        textView = findViewById(R.id.textView);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);

        textView23 = findViewById(R.id.textView23);
        imageView = findViewById(R.id.imageView);

    }

    /**
     * Function to handle dropdown selection
     *
     * @param adapterView
     * @param view
     * @param position
     * @param l
     */
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        switch (adapterView.getId()) {
            case R.id.spinnerColor1:
                selectedColor = String.valueOf(arrayList_season.get(position).getColorName());
                Log.i(TAG, "Selected 1st band color ==>" + selectedColor);
                selectedValue = String.valueOf(arrayList_season.get(position).getColorCode());
                PreferencesUtils.setData("first_band", selectedValue, this);
                break;
            case R.id.spinnerColor2:
                selectedColor = String.valueOf(arrayList_season.get(position).getColorName());
                Log.i(TAG, "Selected 2nd band color ==> " + selectedColor);
                selectedValue = String.valueOf(arrayList_season.get(position).getColorCode());
                PreferencesUtils.setData("second_band", selectedValue, this);
                break;
            case R.id.spinnerColor3:
                selectedColor = String.valueOf(arrayList_season.get(position).getColorName());
                Log.i(TAG, "Selected 3rd band color ==> " + selectedColor);
                selectedValue = String.valueOf(arrayList_season.get(position).getColorCode());
                PreferencesUtils.setData("third_band", selectedValue, this);
                spinnerColor4.setSelection(position);
                PreferencesUtils.setData("multiplier", String.valueOf(arrayList_season.get(position).getMultiplierCode()), this);
                break;
            case R.id.spinnerColor4:
                selectedMultiplier = String.valueOf(arrayList_multiplier.get(position).getMultiplierName());
                Log.i(TAG, "Selected multiplier value ==> " + selectedMultiplier);
                selectedValue = String.valueOf(arrayList_multiplier.get(position).getMultiplierValue());
                PreferencesUtils.setData("multiplier", selectedValue, this);
                break;
            case R.id.spinnerColor5:
                selectedTolerance = String.valueOf(arrayList_tolerance.get(position).getToleranceName());
                selectedValue = String.valueOf(arrayList_tolerance.get(position).getToleranceValue());
                Log.i(TAG, "Selected tolerance value ==> " + selectedTolerance);
                PreferencesUtils.setData("tolerance", selectedValue, this);
                break;
            default:
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.i(TAG, "Nothing selected from dropdown");
    }

    /**
     * Function to populate the tolerance dropdown data
     *
     * @return
     */
    private ArrayList<ToleranceModel> populateToleranceDropdownData() {
        arrayList_tolerance = new ArrayList<>();
        arrayList_tolerance.add(new ToleranceModel("Gold", "plus/minus 5%"));
        arrayList_tolerance.add(new ToleranceModel("Silver", "plus/minus 10%"));

        return arrayList_tolerance;
    }

    /**
     * Function to populate the color dropdown data
     *
     * @return
     */
    private ArrayList<ResistorModel> populateColorDropdownData() {
        arrayList_season = new ArrayList<>();
        arrayList_season.add(new ResistorModel("Black", 0, 1));
        arrayList_season.add(new ResistorModel("Brown", 1, 10));
        arrayList_season.add(new ResistorModel("Red", 2, 100));
        arrayList_season.add(new ResistorModel("Orange", 3, 1000));
        arrayList_season.add(new ResistorModel("Yellow", 4, 10000));
        arrayList_season.add(new ResistorModel("Green", 5, 100000));
        arrayList_season.add(new ResistorModel("Blue", 6, 1000000));
        arrayList_season.add(new ResistorModel("Violet", 7, 10000000));
        arrayList_season.add(new ResistorModel("Grey", 8, -1));
        arrayList_season.add(new ResistorModel("White", 9, -1));

        return arrayList_season;
    }

    /**
     * Populate multiplier dropdown data
     *
     * @return
     */
    private ArrayList<MultiplierModel> populateMultiplierDropdownData() {
        arrayList_multiplier = new ArrayList<>();
        arrayList_multiplier.add(new MultiplierModel("1", 1));
        arrayList_multiplier.add(new MultiplierModel("10", 10));
        arrayList_multiplier.add(new MultiplierModel("100", 100));
        arrayList_multiplier.add(new MultiplierModel("1K", 1000));
        arrayList_multiplier.add(new MultiplierModel("10K", 10000));
        arrayList_multiplier.add(new MultiplierModel("100K", 100000));
        arrayList_multiplier.add(new MultiplierModel("1M", 1000000));
        arrayList_multiplier.add(new MultiplierModel("10M", 10000000));
        return arrayList_multiplier;
    }

}