package com.yourself;

public class Alarm {
    public void Check() {
        if (Clock.GetInstance().GetStatus() == 4) {
            System.out.println("Ring ring ring !");
        }
    }
}