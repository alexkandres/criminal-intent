package com.example.alex.criminalintent;

import java.util.UUID;

/**
 * Created by Alex on 5/25/2015.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        //Generates unique id
        mId = UUID.randomUUID();
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
}
