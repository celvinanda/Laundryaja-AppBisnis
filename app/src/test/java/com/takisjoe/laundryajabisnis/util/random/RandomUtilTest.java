package com.takisjoe.laundryajabisnis.util.random;

import com.takisjoe.laundryajabisnis.util.debug.TagRepository;
import com.takisjoe.laundryajabisnis.util.debug.TagUtil;

import junit.framework.TestCase;

public class RandomUtilTest extends TestCase {

    public void testGetNumber() {
        TagUtil.i("Testing", "Kode "+RandomUtil.getNumber(11));
    }

    public void testGetText() {
        TagUtil.i("Testing", RandomUtil.getCharAZ(2));
    }
}