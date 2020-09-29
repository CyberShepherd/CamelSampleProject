package com.release11.modzeleg;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

public class NumberReceiverRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("seda:sedaqueue")
                .log("Received message from seda:sedaqueue")
                .setHeader(Exchange.HTTP_METHOD, constant("PUT"))
                .to("http://localhost:1080/numbers")
                .log("Message sent to REST api");
    }
}
