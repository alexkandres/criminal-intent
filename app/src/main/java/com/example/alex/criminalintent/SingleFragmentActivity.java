package com.example.alex.criminalintent;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Alex on 6/3/2015.
 */
abstract public class SingleFragmentActivity extends FragmentActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
