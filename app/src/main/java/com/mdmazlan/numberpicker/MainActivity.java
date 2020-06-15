package com.mdmazlan.numberpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements NumberPicker.OnValueChangeListener {

    private TextView tv_output_value_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_output_value_v = findViewById(R.id.tv_value_id);
        NumberPicker numberPicker = findViewById(R.id.number_picker_id);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(30);
        numberPicker.setOnValueChangedListener(this);
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i1) {
        tv_output_value_v.setText("Old Value   = " + i + "\nNew Value = " + i1);
    }
}