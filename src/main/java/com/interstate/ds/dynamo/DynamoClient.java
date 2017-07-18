package com.interstate.ds.dynamo;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

/**
 * Created by bopan on 7/16/17.
 */
public class DynamoClient {
    private static AmazonDynamoDB INSTANCE = null;

    private DynamoClient() {
    }

    public static AmazonDynamoDB getInstance() {
        if (INSTANCE == null) {
            AmazonDynamoDBClientBuilder builder = AmazonDynamoDBClientBuilder.standard();
            builder.setRegion("us-west-2");
            INSTANCE = builder.build();
        }
        return INSTANCE;
    }
}
