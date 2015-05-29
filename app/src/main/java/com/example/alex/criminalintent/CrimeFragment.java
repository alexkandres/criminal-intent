package com.example.alex.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by Alex on 5/25/2015.
 */
public class CrimeFragment extends android.app.Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, container,false);;
        //finding the views
        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
        mDateButton = (Button)v.findViewById(R.id.crime_date);
        mTitleField = (EditText)v.findViewById(R.id.crime_title);

        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                mCrime.setTitle(s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Space intentionally left blank
            }

            @Override
            public void afterTextChanged(Editable s) {
                //Space intentionally left blank
            }
        });//Changing the text of the crime

        SimpleDateFormat sdf= new SimpleDateFormat("EEEE, MMM F, yyyy", Locale.US);
        mDateButton.setText(sdf.format(mCrime.getDate())); //set the text of the button to the crime date
        mDateButton.setEnabled(false);

        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCrime.setSolved(isChecked);// update whether crime is solved
            }
        });


        return v;
    }
}
