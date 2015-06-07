package com.example.alex.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Alex on 5/25/2015.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        //Generates unique id
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId(){
        return  mId;
    }

    public String getTitle(){
        return  mTitle;
    }

    public void setTitle(String mTitle){
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
