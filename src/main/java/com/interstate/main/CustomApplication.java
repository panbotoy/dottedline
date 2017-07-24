package com.interstate.main;

import com.interstate.exceptions.CustomExceptionMapper;
import com.interstate.resources.MyResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * This class registers filter chains, resource files etc for the application
 * It is the main class the application configuration
 *
 */
public class CustomApplication extends ResourceConfig {
    public CustomApplication() {
        register(RequestContextFilter.class);
        register(MyResource.class);
        register(CustomExceptionMapper.class);
    }
}
