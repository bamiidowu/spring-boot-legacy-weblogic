package com.boostrdev.weblogic.legacy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Tell Spring to automatically inject any dependencies that are marked in
//our classes with @Autowired
@EnableAutoConfiguration
// Tell Spring to turn on WebMVC (e.g., it should enable the DispatcherServlet
// so that requests can be routed to our Controllers)
@EnableWebMvc
// Tell Spring that this object represents a Configuration for the
// application
@Configuration
// SpringBootWebLogicLegacyApplication is a SpringBootServletInitializer subclass and override its configure method.
public class SpringBootWebLogicLegacyApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

	// Tell Spring to launch our app!
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebLogicLegacyApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootWebLogicLegacyApplication.class).showBanner(false);
	}
}
