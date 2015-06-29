package com.example.alex.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Where the crime gets handled with singleton
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;
    private ArrayList<Crime> mCrimes;

    private CrimeLab(Context appContext){//singleton allows one instance of itself
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();

        for(int i = 0; i < 100;i++){ //Creating 100 crimes
            Crime crime = new Crime();
            crime.setTitle("Crime #"+i);
            crime.setSolved(i%2 == 0);
            mCrimes.add(crime);
        }
    }

    public static CrimeLab get(Context c){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());//calling c.getApplicationContext insures long term
        }
        return  sCrimeLab;
    }

    public ArrayList<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(int i = 0; i < mCrimes.size(); i++){//can change to enhanced for loop
            if(mCrimes.get(i).getId().equals(id))
                return mCrimes.get(i);
        }
        return null;
    }
}
