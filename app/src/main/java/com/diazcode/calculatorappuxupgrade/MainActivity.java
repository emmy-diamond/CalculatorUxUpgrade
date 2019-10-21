package com.diazcode.calculatorappuxupgrade;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);
        final TextView textViewMiles = findViewById(R.id.textViewMiles);
        final TextView textViewKilometers = findViewById(R.id.textViewKilometers);



        editText.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String getEditText;
                getEditText = editText.getText().toString();
                if (editText != null) {

                    double convertToDoubleAndToKm = Double.parseDouble(getEditText) * 1.60934;
                    textViewMiles.setText(convertToDoubleAndToKm + " Km");


                /*else if (editText2 != null){
                    double convertToDoubleAndToMiles = Double.parseDouble(getEditText) / 1.60934;
                    textViewKilometers.setText(convertToDoubleAndToMiles + "mi");*/
                }
                return false;


            }
        } );




    }
}



    /*private TextView.OnEditorActionListener editorListener = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            switch (TextView){
                case editorListener.onEditorAction():
                    Toast.makeText(MainActivity.this, "view", Toast.LENGTH_SHORT).show();
            }
            return false;
        }
    };*/


