package com.yourself;

public class Clock implements IClock {

    private static Clock instance;

    public static IClock GetInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public int GetStatus() {
        return (int) System.currentTimeMillis() % 10;
    }

}