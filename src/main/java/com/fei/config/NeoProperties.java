package com.fei.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@ConfigurationProperties(prefix="neo")
@Data
public class NeoProperties {
    private String title;
    private String description;

    //省略getter settet方法
}