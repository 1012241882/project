package com.sy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.sy")
@Order(Ordered.HIGHEST_PRECEDENCE)
@EnableTransactionManagement
@Import(value = {SpringShiroConfig.class,SpringEsConfig.class})
@EnableElasticsearchRepositories(basePackages="com.sy.common.es")
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run( ProjectApplication.class, args);
    }

}
