package com.example.alex.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Alex on 5/25/2015.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

}
