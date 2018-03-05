package com.shipment.tracking.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown=true)
public class QuoteResponse {
    public  String status;
    public  Error error;
    public  Data data;
    
    public QuoteResponse(@JsonProperty("status") String status, @JsonProperty("error") Error error, @JsonProperty("data") Data data){
        this.status = status;
        this.error = error;
        this.data = data;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
   
}