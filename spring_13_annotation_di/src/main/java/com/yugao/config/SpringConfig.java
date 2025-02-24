package com.yugao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.yugao")
// 通过@PropertySource加载配置文件
@PropertySource({"jdbc.properties"})
public class SpringConfig {
}
