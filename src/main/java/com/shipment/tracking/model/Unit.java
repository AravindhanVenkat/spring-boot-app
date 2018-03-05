package com.shipment.tracking.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class Unit {

	public List<Charge> charges;
	public String description;
	public String isotype;

	public Unit(@JsonProperty("charges") List<Charge> charges, @JsonProperty("description") String description,
			@JsonProperty("isotype") String isotype) {
		this.charges = charges;
		this.description = description;
		this.isotype = isotype;
	}

	public List<Charge> getCharges() {
		return charges;
	}

	public void setCharges(List<Charge> charges) {
		this.charges = charges;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsotype() {
		return isotype;
	}

	public void setIsotype(String isotype) {
		this.isotype = isotype;
	}

}
