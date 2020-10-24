package com.nokchax.observer.leetcode.domain.user;

import lombok.Data;

import javax.jdo.annotations.Unique;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table
@Entity
public class User {
    @Id
    private String id;
    private String name;
    @Unique
    private String telegramId;

    private int total;
    private int easy;
    private int medium;
    private int hard;
}
