package com.shipment.tracking.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class Route {
	public Poo poo;
	public Fd fd;

	public Route(@JsonProperty("poo") Poo poo, @JsonProperty("fd") Fd fd) {
		this.poo = poo;
		this.fd = fd;
	}

	public Poo getPoo() {
		return poo;
	}

	public void setPoo(Poo poo) {
		this.poo = poo;
	}

	public Fd getFd() {
		return fd;
	}

	public void setFd(Fd fd) {
		this.fd = fd;
	}

}
