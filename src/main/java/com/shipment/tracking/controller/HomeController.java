package com.shipment.tracking.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@RequestMapping(value="/api/call", method = RequestMethod.GET)
	public ResponseEntity<Map<String,String>> getLogin(){
		Map<String,String> result = new HashMap<String,String>();
		result.put("tamil","100");
		result.put("maths","90");
		result.put("science","90");
		result.put("social","90");
		return new ResponseEntity<Map<String,String>>(result,HttpStatus.OK);
	}
}
