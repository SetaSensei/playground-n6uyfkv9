package com.yourself;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AlarmTest {

    @Test
    public void alarmShouldAlwaysRing() {
        Alarm alarm = new Alarm();
        String ring = alarm.check();

        assertEquals("Ring ring ring ring !", ring);
    }
}