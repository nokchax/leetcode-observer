package com.nokchax.observer.leetcode.domain.point;

import com.nokchax.observer.leetcode.domain.user.User;
import lombok.Getter;

import java.time.LocalDateTime;

public class Point {
    private User user;
    private LocalDateTime dateTime;
    private int point;
    private Description description;

    @Getter
    public enum Description {
        FINES("벌금 부과"),
        PAY_FINES("벌금 납부"),
        PROVIDE_POINT("포인트 지급"),
        USE_POINT("포인트 사용");

        private String desc;

        Description(String desc) {
            this.desc = desc;
        }
    }
}
