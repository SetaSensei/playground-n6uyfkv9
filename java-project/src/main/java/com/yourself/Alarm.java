package com.yourself;

public class Alarm {

    IClock clock;

    public Alarm() {
        clock = Clock.GetInstance();
    }

    public String check() {
        if (clock.GetStatus() == 4) {
            return "Ring ring ring ring !";
        }
        return "";
    }
}