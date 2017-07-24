package com.interstate.main;

import com.interstate.resources.MyResource;
import org.apache.log4j.Logger;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;

/**
 * This is the main class used to start the grizzly server locally
 *
 */
public class MyDriver {
    private static final Logger logger = Logger.getLogger(MyDriver.class);
    public static void main(String [] args) {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
        ResourceConfig config = new ResourceConfig(MyResource.class);

        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseUri, config);
        try {
            server.start();
        } catch (IOException e) {
            logger.error("Error with starting local grizzly server.", e);
        }
    }
}
