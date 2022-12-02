package com.takisjoe.laundryajabisnis.util.random;

import androidx.annotation.NonNull;

import com.takisjoe.laundryajabisnis.util.debug.TagUtil;

import org.jetbrains.annotations.Contract;

import java.util.Random;

public class RandomUtil {

    static int getNumber(int digit) {
        int maxInteger = 2000000000;
        int result;
        Random random = new Random();
        if (digit > String.valueOf(maxInteger).length()) {
            result = -1;
        }else {
            do {
                result = random.nextInt(maxInteger);
            } while (String.valueOf(result).length() != digit);
        }
        return result;
    }

    static String getCharAZ(int digit) {
        String result = "";
        Random random = new Random();
        result = String.valueOf(('a' + random.nextInt(26)));
        return result;
    }

    @NonNull
    @Contract(pure = true)
    static String Exception() {
        String result = "";
        //-1 : digit lebih dari kapasitas
        return result;
    }
}
