package com.yourself;

public class Alarm {
    public String check() {
        if (Clock.GetInstance().GetStatus() == 4) {
            return "Ring ring ring !";
        }
        return "";
    }
}