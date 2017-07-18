package com.interstate.resources;

import com.interstate.ds.dynamo.DynamoDBAccessor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
    private final DynamoDBAccessor _dynamoDbAccessor = new DynamoDBAccessor();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        String testMember = _dynamoDbAccessor.get(null, "Member", null);
        return testMember;
    }
}
