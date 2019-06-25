package com.yourself;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class AlarmTest {

    @Test
    public void alarmShouldAlwaysRing() {
        IClock clock = mock(IClock.class);

        Alarm alarm = new Alarm();
        String ring = alarm.check();

        assertEquals("Ring ring ring ring !", ring);
    }
}