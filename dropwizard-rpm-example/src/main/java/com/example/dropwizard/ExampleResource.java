package com.example.dropwizard;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/test")
public class ExampleResource {
    private static final Logger logger = LoggerFactory.getLogger( ExampleResource.class );

    @GET
    public String test() {
        logger.info( "Someone invoked the test method" );
        return "OK";
    }
}
