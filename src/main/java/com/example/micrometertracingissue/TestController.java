package com.example.micrometertracingissue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

	private static final Logger log = LogManager.getLogger(TestController.class);

	@GetMapping("/test")
	public Mono<String> test() {
		log.debug("TestController::test this log should contain a trace and span id.");
		return Mono.just("hello world");
	}
}