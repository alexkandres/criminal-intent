package com.example.alex.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Alex on 5/30/2015.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;
    private ArrayList<Crime> mCrimes;
    private CrimeLab(Context appContext){//singleton
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();
    }

    public static CrimeLab get(Context c){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
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
