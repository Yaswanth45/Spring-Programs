package com.cts.swrd.model;

import java.io.Serializable;

public class AppSecurityToken implements Serializable {


	private static final long serialVersionUID = -1560727899179981193L;
	private final String jwttoken;
	
	public AppSecurityToken(String jwttoken) {
		this.jwttoken=jwttoken;
	}
	public String getToken() {
		return this.jwttoken;
	}

}
