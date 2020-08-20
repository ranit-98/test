package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.OrderResponse;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.repository.DoctorRepoisitory;

@Service
public class ServiceImpl implements ServiceInterface {
	
	@Autowired
	private DoctorRepoisitory doctorRepoisitory;
	
	
	

	public ServiceImpl(DoctorRepoisitory doctorRepoisitory) {
		super();
		this.doctorRepoisitory = doctorRepoisitory;
	}




	@Override
	public List<OrderResponse> getAllpaitient(String doctorName) {
		
//		return doctorRepoisitory.getPaitent(doctorName);
		List<OrderResponse> orderResponse=doctorRepoisitory.getPaitent(doctorName);
//		ArrayList<OrderResponse> paitientArray = new ArrayList<OrderResponse>();
//		
//		for(int i=0;i<orderResponse.size();i++) {
//		OrderResponse ord=new OrderResponse();
//		ord.setPateintname(orderResponse);
//		paitientArray.add(ord);
//		}
		return orderResponse;

	}
	}
//		paitientArray.add(doctorRepoisitory.getPaitent(doctorName));
		
				
//		for(Patient p :doctorPatient) 
//		{
//			OrderResponse theOrderResponse=new OrderResponse();
//			theOrderResponse.setPateintname(p.getPateintname());
//			orderResponse.add(theOrderResponse);
//		}
//		
		

		
//		return orderResponse;
//	}
//
//}
