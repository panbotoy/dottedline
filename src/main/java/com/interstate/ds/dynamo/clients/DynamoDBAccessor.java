package com.interstate.ds.dynamo.clients;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * A convenient class that wraps dynamo requests into convenient http semantics based methods such as GET, BATCH_GET,
 * POST etc.
 *
 * This is a general class, and can be used by different specific entity clients.
 *
 */
public class DynamoDBAccessor {
    private final AmazonDynamoDB dynamoClient = DynamoClient.getInstance();

    public Map<String, AttributeValue> get(String tableName, HashMap<String,AttributeValue> keysToGet) {
        GetItemRequest request = new GetItemRequest()
                .withKey(keysToGet)
                .withTableName(tableName);
        Map<String,AttributeValue> returnedItem = dynamoClient.getItem(request).getItem();
        return returnedItem;
    }
}
