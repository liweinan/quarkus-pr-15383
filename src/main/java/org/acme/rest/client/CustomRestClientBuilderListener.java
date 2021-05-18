package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.eclipse.microprofile.rest.client.spi.RestClientBuilderListener;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class CustomRestClientBuilderListener implements RestClientBuilderListener {

    @Override
    public void onNewBuilder(RestClientBuilder builder) {
        builder.property("resteasy.connectionTTL", Arrays.asList(1, TimeUnit.NANOSECONDS));
        builder.property("resteasy.maxPooledPerRoute", 1);
    }
}
