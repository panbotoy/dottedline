package com.interstate.resources;

import com.interstate.ds.dynamo.DynamoDBAccessor;
import com.interstate.models.Member;
import org.apache.http.HttpStatus;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
    private final DynamoDBAccessor _dynamoDbAccessor = new DynamoDBAccessor();
    private final Logger logger = Logger.getLogger(MyResource.class);

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {
        logger.info("Entered get it test method!");
        return "Get it";
    }

    /**
     * A sample get method to get member by Id
     *
     * @param memberId
     * @return
     */
    @GET
    @Path("{memberId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Member getMemberById(@PathParam("memberId") long memberId) {
        logger.error(String.format("trying to get member for member Id %s", memberId));
        //String testMember = _dynamoDbAccessor.get(null, "Member", null);
        return new Member().setMemberId(123).setUsername("bopan").setEmail("bopan@isco.com");
    }

    /**
     * A sample method demonstrating how to create a POST method which takes
     * a json and convert into java object, and return a response.
     *
     * @param member
     * @return a create response
     */
    @POST
    @Path("testCreateMember")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response testCreateMember(Member member) {
        return Response.status(HttpStatus.SC_NO_CONTENT).entity(member).build();
    }
}
