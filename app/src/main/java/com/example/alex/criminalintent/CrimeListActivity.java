package com.example.alex.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Alex on 6/3/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
