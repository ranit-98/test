package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	@Column
	private String pateintname;
	@Column
	private Integer height;
	@Column
	private Integer age;
	
	
	
	public Patient() {
		
	}

	public Patient(String pateintname, Integer height, Integer age) {
		super();
		this.pateintname = pateintname;
		this.height = height;
		this.age = age;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	
	public String getPateintname() {
		return pateintname;
	}

	public void setPateintname(String pateintname) {
		this.pateintname = pateintname;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	
	
	

}
