package com.example.readdatafrompresto;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PrestoConfig {
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .driverClassName("com.facebook.presto.jdbc.PrestoDriver")
                .url("jdbc:presto://8c9a8839-3f7d-4fcf-b523-1bae0b0f592e.co1u05ot0jqujbai8j2g.lakehouse.appdomain.cloud:31389?SSL=true")
                .username("ibmlhapikey")
                .password("NDT_fG_okd1DgTV0nmUsYMeUg25-Yn8irscF20ypTJ0b")
                .build();
    }
}
