package com.shipment.tracking.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shipment.tracking.service.LCLQuoteService;
import com.shipment.tracking.util.UrlPath;


@RestController
@RequestMapping(UrlPath.LCLPath+""+UrlPath.QuoteURLPath)
public class HomeController {

	@Autowired
	private LCLQuoteService lclQuoteService;
	
	@RequestMapping(value=UrlPath.CarrierURL, method = RequestMethod.GET)
	public Map<String,String> getLogin(){
		return new HashMap<String,String>(){{
			put("status","true");
			put("error","true");
		}};
//		return new ResponseEntity<String>(lclQuoteService.getLCLQuoteData(),HttpStatus.OK);
	}
}
