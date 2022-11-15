package com.iamvickyav.dockerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class DockerDemoApp extends SpringBootServletInitializer {
	private static final Logger log = LoggerFactory.getLogger(DockerDemoApp.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}

	public static void main(String[] args) {
		log.info("----------SpringApplicationBuilder----- Started-------");
		SpringApplication.run(DockerDemoApp.class, args);
		log.info("----------SpringApplicationBuilder----- Started-------");

	}
}
