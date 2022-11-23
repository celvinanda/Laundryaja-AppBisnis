package com.takisjoe.laundryajabisnis.util.debug;

public class TagRepository extends TagUtil {

    private static final String tag = "Repository";

    public static void error(String message) {
        e(tag, message);
    }

    public static void succes(String message) {
        i(tag, message);
    }

    public static void testing(String message) {
        w(tag, message);
    }
}
