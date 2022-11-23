package com.takisjoe.laundryajabisnis.util.timestamp;

public interface TimestampUtil {

    /**
     *
     * @return timestamp saat ini
     */
    static Long getNewTimestamp() {
        return new TimestampImplUtil().getTimestamp();
    }

    /**
     *
     * @return nilai long timstamp setelah dimanipulasi
     */
    Long getTimestamp();

}
