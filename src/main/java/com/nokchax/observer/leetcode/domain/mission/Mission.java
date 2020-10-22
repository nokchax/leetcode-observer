package com.nokchax.observer.leetcode.domain.mission;

import com.nokchax.observer.leetcode.domain.entry.Entry;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

public class Mission {
    private Long no;
    private int goalScore;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Set<Entry> entry = new LinkedHashSet<>();
}
