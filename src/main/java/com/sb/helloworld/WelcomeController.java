package com.sb.helloworld;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	// inject via application.properties
	//@Value("${welcome.message:test}")
	private String message = "Hello World1---deepak";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {

		logger.info("Welcome {}", "testing");

		model.put("message", this.message);
		return "welcome";
	}

}