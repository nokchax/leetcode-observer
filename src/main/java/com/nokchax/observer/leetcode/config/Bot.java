package com.nokchax.observer.leetcode.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "telegram")
public class Bot {
    private String name;
    private String token;
}
