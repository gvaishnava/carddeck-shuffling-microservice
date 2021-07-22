package com.cisco.carddeckshufflingmicroservice;

@RestController
public class DeckController {
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "hi";
	}

}
