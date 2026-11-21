package com.hms.model;

public class Patient {

	// Instance Variables
	private int patientId;
	private String patientName;
	private int age;
	private String gender;
	private String phoneNumber;
	private String disease;

	// Default Constructor
	public Patient() {

	}

	// Parameterized Constructor
	public Patient(int patientId, String patientName, int age, String gender, String phoneNumber, String disease) {

		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.disease = disease;
	}

	// Getters and Setters

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	// Display Patient Details
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + ", gender="
				+ gender + ", phoneNumber=" + phoneNumber + ", disease=" + disease + "]";
	}

}
