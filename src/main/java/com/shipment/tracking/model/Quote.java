package com.shipment.tracking.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	public Route route;
	public String transno;
	public String ratecode;
	public String ratedesc;
	public String hazmat;
	public List<Carrier> carriers;

	public Quote(@JsonProperty("route") Route route, @JsonProperty("transno") String transno,
			@JsonProperty("ratecode") String ratecode, @JsonProperty("ratedesc") String ratedesc,
			@JsonProperty("hazmat") String hazmat, @JsonProperty("carriers") List<Carrier> carriers) {
		this.route = route;
		this.transno = transno;
		this.ratecode = ratecode;
		this.ratedesc = ratedesc;
		this.hazmat = hazmat;
		this.carriers = carriers;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public String getTransno() {
		return transno;
	}

	public void setTransno(String transno) {
		this.transno = transno;
	}

	public String getRatecode() {
		return ratecode;
	}

	public void setRatecode(String ratecode) {
		this.ratecode = ratecode;
	}

	public String getRatedesc() {
		return ratedesc;
	}

	public void setRatedesc(String ratedesc) {
		this.ratedesc = ratedesc;
	}

	public String getHazmat() {
		return hazmat;
	}

	public void setHazmat(String hazmat) {
		this.hazmat = hazmat;
	}

	public List<Carrier> getCarriers() {
		return carriers;
	}

	public void setCarriers(List<Carrier> carriers) {
		this.carriers = carriers;
	}
}
