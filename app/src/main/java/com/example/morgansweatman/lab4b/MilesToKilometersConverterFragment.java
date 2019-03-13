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
public class MilesToKilometersConverterFragment extends Fragment implements View.OnClickListener {
    EditText inputM;
    EditText inputK;
    Button convertBtn;

    public MilesToKilometersConverterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_miles_to_kilometers_converter, container, false);

        convertBtn = v.findViewById(R.id.convertBtn);
        convertBtn.setOnClickListener(this);
        inputM = v.findViewById(R.id.inputM);
        inputK = v.findViewById(R.id.inputK);

        return v;
    }

    public void onClick(View v) {

        String m = inputM.getText().toString();
        String k = inputK.getText().toString();

        // Is Miles field empty?  If so, convert from Kilometers

        if ( m.isEmpty() ) {

            // Check Miles field first; if it is not empty, convert to Kilometers

            if ( !k.isEmpty() ) {

                double kilometers = Double.parseDouble(k);
                double miles = kilometers/1.609344;

                inputM.setText( Double.toString(miles) );

            }

        }

        // If Fahrenheit field is not empty, convert to Celsius

        else {
            double miles = Double.parseDouble(m);
            double kilometers = miles * 1.609344;

            inputK.setText( Double.toString(kilometers) );
        }
    }

}