package com.example.security.SpringSmartVehicle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;

import com.sun.istack.NotNull;



@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(unique=true,nullable=false)
	private String dlno;
	@NotBlank
	@Column(unique=true,nullable=false)
	private String pass;
	private String vehicleType;
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public User() {
	}


	public User(String dlno, @NotBlank String pass, String vehicleType) {
		super();
		this.dlno = dlno;
		this.pass = pass;
		this.vehicleType = vehicleType;
	}

	public User(int id, String dlno, @NotBlank String pass, String vehicleType) {
		super();
		this.id = id;
		this.dlno = dlno;
		this.pass = pass;
		this.vehicleType = vehicleType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDlno() {
		return dlno;
	}

	public void setDlno(String dlno) {
		this.dlno = dlno;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
