package com.example.android.quakereport;

/**
 * Created by Dell on 12/6/2017.
 */

public class Earthquake {
    private Double mMagnitude;
    private String mLocation;
    private long mTimeInMilliSeconds;

Earthquake(Double magnitude,String location,long timeInMilliSeconds)
{
    mMagnitude=magnitude;
    mLocation=location;
    mTimeInMilliSeconds=timeInMilliSeconds;
}
public Double getMagnitude(){return mMagnitude;}
    public String getLocation(){return mLocation;}
    public Long getTimeInMilliSeconds(){return mTimeInMilliSeconds;}
}