package com.takisjoe.laundryajabisnis.util.timestamp;

import java.util.Calendar;

public class TimestampImplUtil implements TimestampUtil {
    private Calendar calendar;
    private final Long timestamp;

    public TimestampImplUtil() {
        calendar = Calendar.getInstance();
        timestamp = calendar.getTimeInMillis();
    }

    @Override
    public Long getTimestamp() {
        return timestamp;
    }

}
