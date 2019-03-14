package com.example.morgansweatman.lab4b;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TipCalculatorFragment extends Fragment implements View.OnClickListener {
    private TextView inputBill;
    private TextView inputTipPercentage;
    private TextView inputNumOfPeople;
    private TextView outputResult;
    protected Button calculateBtn;

    public TipCalculatorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tip_calculator, container, false);

        calculateBtn = v.findViewById(R.id.calculateBtn);
        calculateBtn.setOnClickListener(this);
        inputBill = v.findViewById(R.id.inputBill);
        inputTipPercentage = v.findViewById(R.id.inputTipPercentage);
        inputNumOfPeople = v.findViewById(R.id.inputNumOfPeople);
        outputResult = v.findViewById(R.id.outputResult);

        return v;
    }

    @Override
    public void onClick(View v) {

        // gather variables
        Double bill = Double.valueOf(inputBill.getText().toString());
        Double tip = Double.valueOf(inputTipPercentage.getText().toString());
        int party = Integer.valueOf(inputNumOfPeople.getText().toString());

        // add desired tip to bill and evenly split it between party members
        Double costPerPartyMember = (bill + (bill*(tip/100)))/party;

        // display result
        outputResult.setText(costPerPartyMember.toString());
    }

}

