package com.hms.menu;

import java.util.Scanner;

import com.hms.service.PatientService;

public class Menu {

	Scanner sc = new Scanner(System.in);
	PatientService patientService = new PatientService();

	public void displayMenu() {

		int choice;

		do {

			System.out.println("\n========================================");
			System.out.println("     HOSPITAL MANAGEMENT SYSTEM");
			System.out.println("========================================");
			System.out.println("1. Add Patient");
			System.out.println("2. View All Patients");
			System.out.println("3. Search Patient");
			System.out.println("4. Update Patient");
			System.out.println("5. Delete Patient");
			System.out.println("6. Exit");
			System.out.println("========================================");
			System.out.print("Enter Your Choice : ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				patientService.addPatient();
				break;

			case 2:
				patientService.viewPatients();
				break;

			case 3:
				patientService.searchPatient();
				break;

			case 4:
				patientService.updatePatient();
				break;

			case 5:
				patientService.deletePatient();
				break;

			case 6:
				System.out.println("\nThank You for Using Hospital Management System.");
				System.out.println("Application Closed Successfully.");
				break;

			default:
				System.out.println("\nInvalid Choice! Please Try Again.");
			}

		} while (choice != 6);

		sc.close();
	}
}