package com.example.demo.model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoDBConfig {
    @Bean
    public MongoTemplate mongoTemplate() {
        SimpleMongoClientDatabaseFactory primaryConn = new SimpleMongoClientDatabaseFactory("mongodb+srv://root:root@cluster0.cgb4l.mongodb.net/customer?retryWrites=true&w=majority");
        System.out.println(primaryConn);
        MongoTemplate conn = new MongoTemplate(primaryConn);
        System.out.println(conn);
        return conn;
    }
}