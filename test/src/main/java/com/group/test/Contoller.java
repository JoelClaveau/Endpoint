package com.group.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class Contoller {
	
	@GetMapping("/Message")
	  public ResponseEntity Message() {
		return new ResponseEntity(HttpStatus.OK);
	
	}
	@GetMapping(name = "test" , path = "numero")
    public com.group.test.Message Message(@PathVariable("numero") int x){
		
		return new Message(x);
	}	
}
	
