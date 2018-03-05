package com.shipment.tracking.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shipment.tracking.service.RestServiceUtil;
import com.shipment.tracking.util.MappingAnyJsonHttpMessageConverter;

@Service("restServiceUtil")
public class RestServiceUtilImpl implements RestServiceUtil {

	@Override
	public <T> Object get_JsonResponseAsObject(String url, Class<T> responseType) {
		RestTemplate restTemplate = new RestTemplate();
	    restTemplate.setMessageConverters(getMessageConverters());
		Object response = restTemplate.getForObject(url, responseType);
		System.out.println(response.toString());
		return response;
	}

	private List<HttpMessageConverter<?>> getMessageConverters() {
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(new MappingAnyJsonHttpMessageConverter());
		return converters;
	}
}
