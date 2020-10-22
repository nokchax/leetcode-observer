package com.nokchax.observer.leetcode.domain.user;

import lombok.Data;

@Data
public class User {
    private String id;
    private String name;
    private String telegramId;

    private int total;
    private int easy;
    private int medium;
    private int hard;
}
