package com.example.alex.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Activity that hosts the CrimeListFragment
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
