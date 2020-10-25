package com.nokchax.observer.leetcode.domain.problem;

import javax.persistence.*;

@Entity
public class Problem {
    @Id
    private Long id;
    private Long viewId;
    private String title;
    private String titleSlug;
    private boolean hide;
    private Difficulty difficulty;
}
