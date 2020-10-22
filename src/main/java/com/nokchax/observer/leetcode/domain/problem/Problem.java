package com.nokchax.observer.leetcode.domain.problem;

import javax.persistence.*;

public class Problem {
    private Long id;
    private Long viewId;
    private String title;
    private String titleSlug;
    private boolean hide;
    private Difficulty difficulty;
}
