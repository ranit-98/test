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
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer did;
	@Column
	@NotNull
	private String name;
	
	@Email( message="Put proper email adress")
	@Column(unique = true)
	private String email;
	
	@NotEmpty(message="Password not be empty")
	private String password;
	
	@NotBlank(message="Role not be empty")
	private String role;
	
	
	
	@OneToMany(targetEntity = Patient.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "Doctor_id" ,referencedColumnName = "did")
	private List<Patient> patient;
	
	public Doctor() {
		
	}

	

	


	public Doctor(@NotNull String name, @Email(message = "Put proper email adress") String email,
			@NotEmpty(message = "Password not be empty") String password,
			@NotBlank(message = "Role not be empty") String role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}






	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}






	public String getRole() {
		return role;
	}






	public void setRole(String role) {
		this.role = role;
	}

	
	
	
	
	

}
