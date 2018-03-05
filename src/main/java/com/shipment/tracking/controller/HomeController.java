package com.shipment.tracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shipment.tracking.model.QuoteResponse;
import com.shipment.tracking.service.LCLQuoteService;
import com.shipment.tracking.util.UrlPath;


@RestController
@RequestMapping(UrlPath.LCLPath+""+UrlPath.QuoteURLPath)
public class HomeController {

	@Autowired
	private LCLQuoteService lclQuoteService;
	
	@RequestMapping(value=UrlPath.CarrierURL, method = RequestMethod.GET)
	public ResponseEntity<QuoteResponse> getLogin(){
		return new ResponseEntity<QuoteResponse>(lclQuoteService.getLCLQuoteData(),HttpStatus.OK);
	}
}
