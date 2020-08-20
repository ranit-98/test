package com.example.demo.securityservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctor;
import com.example.demo.model.MyDoctorDetails;
import com.example.demo.repository.DoctorRepoisitory;

@Service
public class CustomDoctorDetails implements UserDetailsService {
	
	@Autowired
	private DoctorRepoisitory doctorRepoisitory;

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		
		Optional<Doctor> doctor = doctorRepoisitory.findByEmail(s);
		doctor.orElseThrow(() -> new UsernameNotFoundException("Not found: " + s));
		return doctor.map(MyDoctorDetails::new).get();
	}
	
	

}
