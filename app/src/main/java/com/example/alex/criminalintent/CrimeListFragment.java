package com.example.alex.criminalintent;

import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alex on 6/3/2015.
 */
public class CrimeListFragment extends ListFragment{
    private ArrayList<Crime> mCrimeLab;
    private String TAG = "CrimeListFragment";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crime_title);
        mCrimeLab = CrimeLab.get(getActivity()).getCrimes();//static method get returns ArrayList of crimes

        //ArrayAdapter<Crime> adapter = new ArrayAdapter<Crime>(getActivity(),android.R.layout.simple_list_item_1, mCrimeLab);
        CrimeAdapter adapter = new CrimeAdapter(mCrimeLab);
        setListAdapter(adapter);
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        //Crime c = (Crime) getListAdapter().getItem(position);//list fragment convenience method
        Crime c = ((CrimeAdapter)getListAdapter()).getItem(position);
        Log.d(TAG, c.getTitle() + " was clicked");
    }

    private class CrimeAdapter extends ArrayAdapter<Crime>{//custom adapter inner class that works with crime methods

        public CrimeAdapter(ArrayList<Crime> crimes){
            super(getActivity(), 0, crimes);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            //Inflate view if not given one
            if(convertView == null){
                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_crime, null);
            }

            //Configure view for crime
            Crime c = getItem(position);

            TextView titleTextView = (TextView) convertView.findViewById(R.id.crime_list_item_titleTextView);
            titleTextView.setText(c.getTitle());
            TextView dateTextView = (TextView) convertView.findViewById(R.id.crime_list_item_dateTextView);
            dateTextView.setText(c.getDate().toString());
            CheckBox solvedCheckedBox = (CheckBox) convertView.findViewById(R.id.crime_list_item_solvedCheckBox);
            solvedCheckedBox.setChecked(c.isSolved());

            return convertView;
        }
    }
}
