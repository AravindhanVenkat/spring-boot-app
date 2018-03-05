package com.shipment.tracking.service.impl;

import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.shipment.tracking.model.QuoteResponse;
import com.shipment.tracking.service.LCLQuoteService;
import com.shipment.tracking.service.RestServiceUtil;

@Service("lclQuoteService")
public class LCLQuoteServiceImpl implements LCLQuoteService {

	@Autowired
	private RestServiceUtil restServiceUtil;
	
	@Override
	public QuoteResponse getLCLQuoteData() {
		try {
			String url = "https://www.ecuworldwide.us/en/ws/fcl/quote?origin=usmia&destination=jmkin";
		    QuoteResponse response = (QuoteResponse) restServiceUtil.get_JsonResponseAsObject(url, QuoteResponse.class);
			return response;
		} catch (Exception e) {
			try {
			 Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			 JsonParser jParser = new JsonParser();
			 JsonObject jObject = jParser.parse(new FileReader("C:\\Users\\MSTSYS 0100\\Desktop\\FCL.json")).getAsJsonObject();
			 QuoteResponse quoteResponse = gson.fromJson(jObject, QuoteResponse.class);
			 return quoteResponse;
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}

		return null;
	}

}
