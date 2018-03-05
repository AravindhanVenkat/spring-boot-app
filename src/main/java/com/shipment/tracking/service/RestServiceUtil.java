package com.shipment.tracking.service;

public interface RestServiceUtil {
	public <T> Object get_JsonResponseAsObject(String url, Class<T> responseType);
}
