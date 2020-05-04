package com.example.demo;

import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
@CrossOrigin(origins = { "*" })
public class RestApi {
	
	@GetMapping("/predict")
	public ResponseEntity<JSONObject> test (String imagePath) throws Exception{
		String test = "test String";
		JSONObject test2 = new JSONObject();
		test2.put("test", test);
		return new ResponseEntity<JSONObject>(test2, HttpStatus.OK);
	}
}
