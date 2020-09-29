package com.release11.modzeleg;

import org.apache.camel.builder.RouteBuilder;

public class MiddlemanRoute extends RouteBuilder {
    public void configure() throws Exception {
        from("direct:middleman")
                .log("direct:middleman received message")
                .to("activemq:queue:number-queue")
                .log("Sent to JMS Queue");
    }
}
