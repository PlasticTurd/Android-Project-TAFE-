package com.example.j.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {

        EditText inputWidthClone = (EditText) findViewById(R.id.inputWidth);
        EditText inputHeightClone = (EditText) findViewById(R.id.inputHeight);
        double dubWidth = Double.parseDouble(inputWidthClone.getText().toString());
        double dubHeight = Double.parseDouble(inputHeightClone.getText().toString());
        double dubArea = dubWidth * dubHeight;
        double dubPerimeter = (dubWidth * 2) + (dubHeight * 2);

    }
}
