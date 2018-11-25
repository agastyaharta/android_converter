package com.example.asus.unitconverter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class SpeedActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.speed, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner fromSpinner = findViewById(R.id.spinner_speed1);
        Spinner toSpinner = findViewById(R.id.spinner_speed2);

        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);



    }


    public void convert(View view) {
        Spinner fromSpinner, toSpinner;
        EditText fromEditText, toEditText;

        fromSpinner = (Spinner) findViewById(R.id.spinner_speed1);
        toSpinner = (Spinner) findViewById(R.id.spinner_speed2);
        fromEditText = (EditText) findViewById(R.id.editText_from6);
        toEditText = (EditText) findViewById(R.id.editText_to6);

        String fromString = (String) fromSpinner.getSelectedItem();
        String toString = (String) toSpinner.getSelectedItem();
        double input = Double.valueOf(fromEditText.getText().toString());

        ConverterSpeed.Unit fromUnit = ConverterSpeed.Unit.fromString(fromString);
        ConverterSpeed.Unit toUnit = ConverterSpeed.Unit.fromString(toString);

        ConverterSpeed converter = new ConverterSpeed(fromUnit, toUnit);
        double result = converter.convert(input);
        toEditText.setText(String.valueOf(result));
    }
}
