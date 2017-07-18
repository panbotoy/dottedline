package com.interstate.ds.dynamo;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by bopan on 7/16/17.
 */
public class DynamoDBAccessor {
    private final AmazonDynamoDB _dynamoClient = DynamoClient.getInstance();

    public <T> String get(Class<T> clazz, String tableName, Object... keys) {

        HashMap<String,AttributeValue> keysToGet =
                new HashMap<String,AttributeValue>();

        AttributeValue attributeValue = new AttributeValue();
        attributeValue.setS("1");
        keysToGet.put("memberId", attributeValue);

        GetItemRequest request = new GetItemRequest()
                .withKey(keysToGet)
                .withTableName(tableName);
        Map<String,AttributeValue> returnedItem =
                _dynamoClient.getItem(request).getItem();

        return returnedItem.get("1").toString();
    }
}
