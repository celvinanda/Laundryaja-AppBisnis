package com.takisjoe.laundryajabisnis.util.timestamp;

import junit.framework.TestCase;

public class TimestampUtilTest extends TestCase {


    public void testGetNewTimestamp() {
        System.out.println("New Timestamp : " + TimestampUtil.getNewTimestamp());
    }

    public void testGetTimestamp() {
        TimestampUtil util = new TimestampImplUtil();
        System.out.println("Timestamp : " + util.getTimestamp());
    }
}