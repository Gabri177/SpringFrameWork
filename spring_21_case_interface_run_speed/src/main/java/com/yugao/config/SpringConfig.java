package com.yugao.config;


import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.yugao")
@PropertySource("classpath:jdbc.properties")
@Import({MybatisConfig.class, JdbcConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {



}
