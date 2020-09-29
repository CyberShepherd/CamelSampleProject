package com.release11.modzeleg;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class ContextBuilder {
    public static CamelContext build() throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new NumberLauncherRoute());
        context.addRoutes(new MiddlemanRoute());
        context.addRoutes(new SedaRoute());
        context.addRoutes(new NumberReceiverRoute());

        return context;
    }
}
