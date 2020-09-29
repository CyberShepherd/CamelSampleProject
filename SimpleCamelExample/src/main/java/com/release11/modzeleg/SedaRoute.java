package com.release11.modzeleg;

import org.apache.camel.builder.RouteBuilder;

public class SedaRoute extends RouteBuilder {
    public void configure() throws Exception {
        from("activemq:queue:number-queue")
                .log("Received message from queue")
                .to("seda:sedaqueue");
    }
}
