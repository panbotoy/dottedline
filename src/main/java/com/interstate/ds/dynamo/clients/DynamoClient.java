package com.interstate.ds.dynamo.clients;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

/**
 * The basic dynamo client wrapper class that wraps around {@link AmazonDynamoDB}
 *
 */
public class DynamoClient {
    private static AmazonDynamoDB INSTANCE = null;

    private DynamoClient() {
    }

    /**
     * TODO: remove the region into some config.
     * @return
     */
    public static AmazonDynamoDB getInstance() {
        if (INSTANCE == null) {
            AmazonDynamoDBClientBuilder builder = AmazonDynamoDBClientBuilder.standard();
            builder.setRegion("us-west-2");
            INSTANCE = builder.build();
        }
        return INSTANCE;
    }
}
