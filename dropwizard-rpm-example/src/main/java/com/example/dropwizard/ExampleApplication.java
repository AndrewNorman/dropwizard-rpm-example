package com.example.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ExampleApplication extends Application<ApplicationConfiguration> {
    @Override
    public void initialize( Bootstrap<ApplicationConfiguration> bootstrap ) {
    }

    @Override
    public void run( ApplicationConfiguration configuration, Environment environment ) throws Exception {
        environment.jersey().register( new ExampleResource() );
        environment.healthChecks().register( "example", new ExampleHealthCheck() );
    }

    public static void main( final String[] args ) throws Exception {
        new ExampleApplication().run( args );
    }
}
