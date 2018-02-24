package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController class GreetingController {
	class Greeting{
		private Integer id;
		private String message;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}

		
	}
	
	@GetMapping("api/greeting")
	public @ResponseBody Greeting greeting() {
		Greeting g = new Greeting();
		g.setId(1);
		g.setMessage("Hello World");

		return g;
	}
}
