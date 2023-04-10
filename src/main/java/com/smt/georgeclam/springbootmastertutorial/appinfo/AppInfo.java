package com.smt.georgeclam.springbootmastertutorial.appinfo;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
// @ConfigurationProperties(prefix = "info.app")
public class AppInfo {
    private String name = "Spring Boot Master Tutorial";
    private String description = "by Amigos Code";
    private String version = "1.0.0";
    private String participant = "George Clam";
}
