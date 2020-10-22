package com.nokchax.observer.leetcode;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
@ConfigurationPropertiesScan
public class LeetcodeApplication {
    private static final String EXTERNAL_CONFIG_FILE = "/etc/data/observer/leetcode.yml";

    public static void main(String[] args) {
        ApiContextInitializer.init();

        new SpringApplicationBuilder()
                .sources(LeetcodeApplication.class)
                .properties("spring.config.additional-location=file:" + EXTERNAL_CONFIG_FILE)
                .run(args);
    }
}
