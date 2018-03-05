package com.shipment.tracking.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class Poo {

	public String name;
	public String unlc;
	public String remarks;

	public Poo(@JsonProperty("name") String name, @JsonProperty("unlc") String unlc,
			@JsonProperty("remarks") String remarks) {
		this.name = name;
		this.unlc = unlc;
		this.remarks = remarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnlc() {
		return unlc;
	}

	public void setUnlc(String unlc) {
		this.unlc = unlc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
