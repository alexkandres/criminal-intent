package com.example.alex.criminalintent;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by Alex on 6/3/2015.
 * SingleFragmentActivity is abstract so any subclass
 * implements abstract method createFragment();
 */
abstract public class SingleFragmentActivity extends Activity {
    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragmentContainer);

        if(fragment == null){
            fragment = createFragment();
            fragmentManager.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }
    }
}
