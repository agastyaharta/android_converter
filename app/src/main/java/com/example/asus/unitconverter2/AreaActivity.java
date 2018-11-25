package com.example.asus.unitconverter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class AreaActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.area, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner fromSpinner = findViewById(R.id.spinner_area1);
        Spinner toSpinner = findViewById(R.id.spinner_area2);

        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);
    }



    public void convert(View view) {
        Spinner fromSpinner, toSpinner;
        EditText fromEditText, toEditText;

        fromSpinner = (Spinner) findViewById(R.id.spinner_area1);
        toSpinner = (Spinner) findViewById(R.id.spinner_area2);
        fromEditText = (EditText) findViewById(R.id.editText_from2);
        toEditText = (EditText) findViewById(R.id.editText_to2);

        String fromString = (String) fromSpinner.getSelectedItem();
        String toString = (String) toSpinner.getSelectedItem();
        double input = Double.valueOf(fromEditText.getText().toString());

        ConverterArea.Unit fromUnit = ConverterArea.Unit.fromString(fromString);
        ConverterArea.Unit toUnit = ConverterArea.Unit.fromString(toString);

        ConverterArea converter = new ConverterArea(fromUnit, toUnit);
        double result = converter.convert(input);
        toEditText.setText(String.valueOf(result));
    }
}
