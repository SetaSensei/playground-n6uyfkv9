package com.yourself;

public class Clock {

    private static Clock instance;

    public static Clock GetInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public int GetStatus() {
        return 0;
    }

}