package com.release11.modzeleg;

import org.apache.camel.CamelContext;

public class Main {
    public static void main(String[] args) {
        try {
            CamelContext context = ContextBuilder.build();
            context.start();
            Thread.sleep(36000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
