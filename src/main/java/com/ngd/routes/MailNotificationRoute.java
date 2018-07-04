package com.ngd.routes;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MailNotificationRoute extends RouteBuilder{

    public String getWebsocketUrl() { return "websocket://localhost:9090/mail"; }

	@Override
	public void configure() throws Exception {
//        from(getWebsocketUrl())
//        .log(LoggingLevel.INFO, simple("receive ${body} from client").getText())
//        .process(new Processor() {
//            @Override
//            public void process(Exchange exchange) throws Exception {
//            	System.out.println("teste 123");
//            }
//        })
//        .end();
	}

}
