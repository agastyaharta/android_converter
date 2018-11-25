package com.example.asus.unitconverter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class TimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.time, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        Spinner fromSpinner = findViewById(R.id.spinner_time1);
        Spinner toSpinner = findViewById(R.id.spinner_time2);

        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);


    }


    public void convert(View view) {
        Spinner fromSpinner, toSpinner;
        EditText fromEditText, toEditText;

        fromSpinner = (Spinner) findViewById(R.id.spinner_time1);
        toSpinner = (Spinner) findViewById(R.id.spinner_time2);
        fromEditText = (EditText) findViewById(R.id.editText_from5);
        toEditText = (EditText) findViewById(R.id.editText_to5);

        String fromString = (String) fromSpinner.getSelectedItem();
        String toString = (String) toSpinner.getSelectedItem();
        double input = Double.valueOf(fromEditText.getText().toString());

        ConverterTime.Unit fromUnit = ConverterTime.Unit.fromString(fromString);
        ConverterTime.Unit toUnit = ConverterTime.Unit.fromString(toString);

        ConverterTime converter = new ConverterTime(fromUnit, toUnit);
        double result = converter.convert(input);
        toEditText.setText(String.valueOf(result));
    }
}
