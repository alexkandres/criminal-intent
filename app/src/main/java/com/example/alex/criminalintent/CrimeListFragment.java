package com.example.alex.criminalintent;

import android.app.ListFragment;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by Alex on 6/3/2015.
 */
public class CrimeListFragment extends ListFragment{
    private ArrayList<Crime> mCrimeLab;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crime_title);
        mCrimeLab = CrimeLab.get(getActivity()).getCrimes();//static method get returns ArrayList of crimes
    }
    
}
