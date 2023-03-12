package gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration { 	  
	
	@Bean 
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		
		return builder.routes()
				//.route(r->r.path("/credit/**")                 //we are 
				//.uri("http://localhost:8182/")) 
				//.route(r->r.path("/loan/**")
				//.uri("http://localhost:8181/")) 
				//.build();
				
				.route(r->r.path("/aadhar/**")
				.uri("http://localhost:7778/"))
				.route(r->r.path("/pan/**")
				.uri("http://localhost:7779/"))
				.route(r->r.path("/bankcustomerdetails/**")
				.uri("http://localhost:7777/")) 
				.build();
				
	}

}
