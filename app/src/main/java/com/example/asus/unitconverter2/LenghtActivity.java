package com.example.asus.unitconverter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class LenghtActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenght);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.lenght, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner fromSpinner = (Spinner) findViewById(R.id.spinner_lenght1);
        Spinner toSpinner = (Spinner) findViewById(R.id.spinner_lenght2);

        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);


    }


    public void convert(View view) {
        Spinner fromSpinner, toSpinner;
        EditText fromEditText, toEditText;

        fromSpinner = (Spinner) findViewById(R.id.spinner_lenght1);
        toSpinner = (Spinner) findViewById(R.id.spinner_lenght2);
        fromEditText = (EditText) findViewById(R.id.editText_from);
        toEditText = (EditText) findViewById(R.id.editText_to);

        String fromString = (String) fromSpinner.getSelectedItem();
        String toString = (String) toSpinner.getSelectedItem();
        double input = Double.valueOf(fromEditText.getText().toString());


        ConverterLenght.Unit fromUnit = ConverterLenght.Unit.fromString(fromString);
        ConverterLenght.Unit toUnit = ConverterLenght.Unit.fromString(toString);

        ConverterLenght converter = new ConverterLenght(fromUnit, toUnit);
        double result = converter.convert(input);
        toEditText.setText(String.valueOf(result));

    }
}
