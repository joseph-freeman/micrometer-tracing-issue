package com.example.micrometertracingissue;

import reactor.core.publisher.Hooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicrometerTracingIssueApplication {

	public static void main(String[] args) {
		Hooks.enableAutomaticContextPropagation();
		SpringApplication.run(MicrometerTracingIssueApplication.class, args);
	}
}