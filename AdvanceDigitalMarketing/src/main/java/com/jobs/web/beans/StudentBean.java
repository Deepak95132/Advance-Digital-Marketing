package com.jobs.web.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="student")
public class StudentBean {
	public StudentBean(Integer serialNumber, String studentName, String fatherName, String motherName, String emailId,
			Date dob, Long phoneNumber, String address, String sex, String course) {
		super();
		this.serialNumber = serialNumber;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.emailId = emailId;
		this.dob = dob;
		PhoneNumber = phoneNumber;
		this.address = address;
		this.sex = sex;
		this.course = course;
	}
	public StudentBean() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_gen")
	@SequenceGenerator(name="id_gen", sequenceName="seq_gen")
	private Integer serialNumber=1;
	
	private String studentName;
	private String fatherName;
	private String motherName;
	private String emailId;
	private Date dob;
	private Long PhoneNumber;
	private String address;
	private String sex;
	private String course;
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
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
