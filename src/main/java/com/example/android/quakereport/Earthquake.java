package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by November on 18.01.2017.
 */

public class Earthquake {
    private double magnitude;
    private String location;
    private long timeInMilliseconds;

    public String getUrl() {
        return url;
    }

    public String[] getParts() {
        return parts;
    }

    /** Website URL of the earthquake */
    private String url;


    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        this(magnitude, location);
        this.timeInMilliseconds = timeInMilliseconds;
        this.url = url;
    }

    public Earthquake(double magnitude, String location){
        this.magnitude = magnitude;
        this.location = location;
//        timeMilliseconds = "01.01.1990";
    }

    String[] parts = location.split("(?<=of)");

    public double getMagnitude() {
        return magnitude;
    }

    public String getDistance() {
        return parts[0];
    }

    public String getLocation() {
        return parts[1];
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }
}
