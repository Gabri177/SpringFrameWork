package com.yugao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.yugao")
// 通过@Import 导入其他配置
@Import(JdbcConfig.class)
public class SpringConfig {
}
