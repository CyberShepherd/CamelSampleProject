package com.release11.modzeleg;

import org.apache.camel.builder.RouteBuilder;

import java.util.Random;

public class NumberLauncherRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        Random r = new Random();
        from("timer:NumberLauncher?period=18000")
                .setBody(simple("Generated number: " + r.nextInt(100)))
                .log("${body}")
                .to("direct:middleman");

    }
}
