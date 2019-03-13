package com.example.morgansweatman.lab4b;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FahrenheitToCelsiusConverterFragment extends Fragment implements View.OnClickListener {
    EditText inputF;
    EditText inputC;
    Button convertBtn;

    public FahrenheitToCelsiusConverterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fahrenheit_to_celsius_converter, container, false);

        convertBtn = v.findViewById(R.id.convertBtn);
        convertBtn.setOnClickListener(this);
        inputF = v.findViewById(R.id.inputF);
        inputC = v.findViewById(R.id.inputC);

        return v;
    }

    public void onClick(View v) {

        String f = inputF.getText().toString();
        String c = inputC.getText().toString();

        // Is Fahrenheit field empty?  If so, convert from Celsius

        if ( f.isEmpty() ) {

            // Check Celsius field first; if it is not empty, convert to Fahrenheit

            if ( !c.isEmpty() ) {

                double celsius = Double.parseDouble(c);
                double fahrenheit = ((celsius * 9 / 5) + 32);

                inputF.setText( Double.toString(fahrenheit) );

            }

        }

        // If Fahrenheit field is not empty, convert to Celsius

        else {
            double fahrenheit = Double.parseDouble(f);
            double celsius = ((fahrenheit - 32) * 5 / 9);

            inputC.setText( Double.toString(celsius) );
        }
    }

}
