package com.example.micrometertracingissue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/test")
	public Mono<String> test() {
		logger.info("TestController::test this log should contain a trace and span id.");
		return Mono.just("hello world");
	}
}