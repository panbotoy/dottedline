package com.interstate.ds.dynamo.transformers;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.interstate.models.Member;

import java.util.Map;

/**
 * transforms dynamo response into {@link Member}
 */
public class MemberTransformer {
    private MemberTransformer() { }

    public static Member dynamoToMember(Map<String, AttributeValue> dynamoObj) {
        return new Member().setEmail(dynamoObj.get("email").getS())
                .setFirstName(dynamoObj.get("firstName").getS())
                .setLastName(dynamoObj.get("lastName").getS())
                .setMemberId(Long.valueOf(dynamoObj.get("memberId").getS()))
                .setUsername(dynamoObj.get("username").getS())
                .setPassword(dynamoObj.get("password").getS());
    }
}
