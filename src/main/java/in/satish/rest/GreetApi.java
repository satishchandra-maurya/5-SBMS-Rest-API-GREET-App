package in.satish.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.satish.client.WelcomeApiClient;

@RestController
public class GreetApi {
	@Autowired
	private WelcomeApiClient wac; 
	
	@GetMapping("/Greet")
	public String welcomeMsg() {
		String welcomeMsg = wac.invokeWelcomeApi();
		String msg = "Good Morning...!!";
		return welcomeMsg + msg;
	}
}
