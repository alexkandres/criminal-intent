package com.example.alex.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Alex on 5/25/2015.
 */
public class CrimeFragment extends android.app.Fragment {
    private Crime mCrime;
    private EditText mTitleField;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, container,false);;

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
        });


        return v;
    }
}
