package com.shipment.tracking.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class Carrier {

	public String no;
	public String name;
	public String remarks;
	public List<Unit> units;

	public Carrier(@JsonProperty("no") String no, @JsonProperty("name") String name,
			@JsonProperty("remarks") String remarks, @JsonProperty("units") List<Unit> units) {
		this.no = no;
		this.name = name;
		this.remarks = remarks;
		this.units = units;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

}
