package com.campaignchronicle.campaignchronicle.services;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public abstract class MongoDBConfig {

    protected final String CAMPAIGN_CHRONICLE_DB;
    protected MongoDatabase db;
    protected MongoClient mongoClient;
    @Value("${spring.data.mongodb.uri}")
    private String connectionString;

    protected MongoDBConfig(MongoClient mongoClient, String databaseName) {
        this.mongoClient = mongoClient;
        CAMPAIGN_CHRONICLE_DB = databaseName;
        this.db = this.mongoClient.getDatabase(CAMPAIGN_CHRONICLE_DB);
    }
}
