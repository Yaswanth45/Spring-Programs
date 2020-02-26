package com.cts.swrd.model;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long empId;
	
	@NotEmpty(message="firstName can not be empty")
	@NotNull(message="firstName can not be omitted")
	private String firstName;
	
	@NotEmpty(message="lastName can not be empty")
	@NotNull(message="lastName can not be omitted")
	private String lastName;
	
	@Min(value=25000,message="basic can not be less than 25 Thousand")
	@Max(value=450000,message="basic can not be less than 4.5 Lakh")
	private double basic;
	
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate joinDate;
	
	@Enumerated(EnumType.STRING)
	private Department dept;
	
	@Pattern(regexp="[1-9][0-9]{9}",message="Mobile number is expected to be 10 digits not Letters")
	@NotNull(message="Mobile Number can not be omitted.")
	private String mobileNumber;
	
	@Email(message="email must be a valid one")
	@NotNull(message="Email can not be omitted.")
	private String email;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}