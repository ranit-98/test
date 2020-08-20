package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.Patient;

public class OrderResponse {
	
	private String pateintname;
	
	public OrderResponse() {
		
	}

	public OrderResponse(String pateintname) {
		super();
		this.pateintname = pateintname;
	}


	public String getPateintname() {
		return pateintname;
	}

	public void setPateintname(String pateintname) {
		this.pateintname = pateintname;
	}

	
	
	

}
