package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("purini-music")
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		System.out.println("WelcomeController.welcome(): Start");
		model.put("message", this.message);
		System.out.println("WelcomeController.welcome(): populating welcome.html");
		return "welcome";
	}
	@RequestMapping("/contacts")
	public String contacts(Map<String, Object> model) {
		System.out.println("WelcomeController.contacts(): Start");
		model.put("message", this.message);
		System.out.println("WelcomeController.welcome(): populating contacts.html");
		return "contacts";
	}

}