package com.example.alex.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

/**
 * Created by Alex on 6/17/2015.
 */
public class CrimePagerActivity extends FragmentActivity{
    private ViewPager mViewPager;
    private ArrayList<Crime> mCrimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewPager = new ViewPager(this);
        mViewPager.setId(R.id.viewPager);
        setContentView(mViewPager);

        //get crime ArrayList w/ static method that returns CrimeLab
        mCrimes = CrimeLab.get(this).getCrimes();

        FragmentManager fm = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentPagerAdapter(fm) {
            @Override
            public Fragment getItem(int position) {
                Crime c = mCrimes.get(position);
                return CrimeFragment.newInstance(c.getId());
            }

            @Override
            public int getCount() {
                return mCrimes.size();
            }
        });
    }
}
