package com.maharjan.tablayout.design.area;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.maharjan.tablayout.R;

import java.text.DecimalFormat;

public class AreaFragment extends Fragment {
    private EditText etradius;
    private Button btnCal;
    private TextView txresult;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_area, container, false);
        etradius = root.findViewById(R.id.etR);
        btnCal = root.findViewById(R.id.btnCaluclateR);
        txresult = root.findViewById(R.id.resultR);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!TextUtils.isEmpty(etradius.getText().toString())){
                    DecimalFormat decimalFormat= new DecimalFormat("0.00");
                    double first, result;
                    first = Double.parseDouble(etradius.getText().toString());
                    result = ((22 * first * first)/7);
                    txresult.setText("Area of circle with radius "+decimalFormat.format(first)+" is "+decimalFormat.format(result));}
                else{
                    etradius.setError("please enter value");
                }
            }
        });
        return root;
    }

}