package com.jobs.web.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="student")
public class StudentBean {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_gen")
	@SequenceGenerator(name="id_gen", sequenceName="seq_gen")
	private Integer serialNumber=1;
	
	private String studentName;
	private Long PhoneNumber;
	private String address;
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
