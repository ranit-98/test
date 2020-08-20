package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.OrderResponse;

public interface ServiceInterface {
	
	public List<OrderResponse> getAllpaitient(String doctorName);

}
