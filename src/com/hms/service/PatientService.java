package com.hms.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.hms.model.Patient;

public class PatientService {

	Scanner sc = new Scanner(System.in);

	ArrayList<Patient> patientList = new ArrayList<>();

	// Add Patient
	public void addPatient() {

		System.out.println("\n===== Add New Patient =====");

		System.out.print("Enter Patient ID : ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Patient Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Gender : ");
		String gender = sc.nextLine();

		System.out.print("Enter Phone Number : ");
		String phone = sc.nextLine();

		System.out.print("Enter Disease : ");
		String disease = sc.nextLine();

		Patient patient = new Patient(id, name, age, gender, phone, disease);

		patientList.add(patient);

		System.out.println("\nPatient Added Successfully...");
	}

	// View All Patients
	public void viewPatients() {

		if (patientList.isEmpty()) {

			System.out.println("\nNo Patient Records Found.");
			return;
		}

		System.out.println("\n===== Patient Details =====");

		for (Patient patient : patientList) {

			System.out.println(patient);
		}
	}

	// Search Patient
	public void searchPatient() {

		System.out.print("\nEnter Patient ID : ");
		int id = sc.nextInt();

		boolean found = false;

		for (Patient patient : patientList) {

			if (patient.getPatientId() == id) {

				System.out.println(patient);
				found = true;
				break;
			}
		}

		if (!found) {

			System.out.println("Patient Not Found.");
		}
	}

	// Update Patient
	public void updatePatient() {

		System.out.print("\nEnter Patient ID to Update : ");
		int id = sc.nextInt();
		sc.nextLine();

		boolean found = false;

		for (Patient patient : patientList) {

			if (patient.getPatientId() == id) {

				System.out.print("Enter New Name : ");
				patient.setPatientName(sc.nextLine());

				System.out.print("Enter New Age : ");
				patient.setAge(sc.nextInt());
				sc.nextLine();

				System.out.print("Enter New Gender : ");
				patient.setGender(sc.nextLine());

				System.out.print("Enter New Phone Number : ");
				patient.setPhoneNumber(sc.nextLine());

				System.out.print("Enter New Disease : ");
				patient.setDisease(sc.nextLine());

				System.out.println("\nPatient Updated Successfully.");
				found = true;
				break;
			}
		}

		if (!found) {

			System.out.println("Patient Not Found.");
		}
	}

	// Delete Patient
	public void deletePatient() {

		System.out.print("\nEnter Patient ID to Delete : ");
		int id = sc.nextInt();

		boolean found = false;

		for (Patient patient : patientList) {

			if (patient.getPatientId() == id) {

				patientList.remove(patient);

				System.out.println("\nPatient Deleted Successfully.");

				found = true;
				break;
			}
		}

		if (!found) {

			System.out.println("Patient Not Found.");
		}
	}

}