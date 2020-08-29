package com.example.messagingstompwebsocket;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {


	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception {
		Thread.sleep(1000); // simulated delay
		
		
		FileInputStream fis = new FileInputStream("src/main/resources/static/stringsTooLong.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String s = prop.getProperty("stringTooLongOnlyImage");
		
		return new Greeting(s);
	}

}
