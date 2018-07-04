package com.ngd.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.ngd.model.Person;

@Component
public class PersonRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		restConfiguration().component("servlet").bindingMode(RestBindingMode.auto);

        rest("/person2").get().outType(Person.class)
        .to("direct:talk");
        
        from("direct:talk")
                .process(exchange -> {
                    Person p = new Person();
                    p.setFirstname("Bennet");
                    p.setLastname("Schulz");
                    exchange.getIn().setBody(p);
             });		
	}
}
