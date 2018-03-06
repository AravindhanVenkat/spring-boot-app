package com.shipment.tracking.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shipment.tracking.model.QuoteRequest;
import com.shipment.tracking.service.LCLQuoteService;
import com.shipment.tracking.util.UrlPath;

@RestController
@RequestMapping(UrlPath.LCLPath + "" + UrlPath.QuoteURLPath)
public class HomeController {

	@Autowired
	private LCLQuoteService lclQuoteService;

	@RequestMapping(value = UrlPath.CarrierURL, method = RequestMethod.GET)
	public Map<String, String> getLogin() {
		return new HashMap<String, String>() {
			{
				put("status", "true");
				put("error", "true");
			}
		};
		// return new
		// ResponseEntity<String>(lclQuoteService.getLCLQuoteData(),HttpStatus.OK);
	}

	@RequestMapping(value = UrlPath.QuoteRecord, method = RequestMethod.POST)
	public Map<String, String> postQuote(@RequestBody QuoteRequest quoteRequest) {

		return new HashMap<String, String>() {
			{
				put("status", "usmia".equalsIgnoreCase(quoteRequest.getPoo()) ? "You entered miami" : "No its not Miami");
				put("error", quoteRequest.getFd());
			}
		};
		// return new
		// ResponseEntity<String>(lclQuoteService.getLCLQuoteData(),HttpStatus.OK);
	}
}
