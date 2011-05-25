package br.edu.univas.si.lab3.jlibrarymanagement.view;

import java.util.Scanner;

import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryEmployeeController;

public class JLibraryEmployeeView {
	
	private JLibraryEmployeeController employeeController;
	private Scanner input;
	
	public JLibraryEmployeeView(JLibraryEmployeeController e) {
		this.employeeController = e;
		input = new Scanner(System.in);
	}
	
	public void showEmployeeMainMenu() {
		separator();
		System.out.println("Employee Main Menu");
		separator();
		System.out.println("1) Students Management");
		System.out.println("2) Books Management");
		System.out.println("3) Rent Books Management");
		System.out.println("4) Exit\n");
		employeeController.menuEmployeeMainMenuChoice(getEmployeeMainMenuChoice());
	}
	/**
	 * Method for get and validate the Main menu Choice
	 * @return employeeMainMenuChoice
	 */
	
	private int getEmployeeMainMenuChoice() {
		String employeeMainMenuChoiceStr;
		int employeeMainMenuChoice = -1;
		Boolean isValidChoice = false;
		
		do {
			try {
				System.out.print("Inform your choice: ");
				employeeMainMenuChoiceStr = input.nextLine();
				employeeMainMenuChoice = Integer.parseInt(employeeMainMenuChoiceStr);
				if(employeeMainMenuChoice < 1 || employeeMainMenuChoice > 4){
					throw new Exception("Invalid Value!");
				}
				isValidChoice = true;
			} 
			catch (Exception e) {
				System.out.println("\nError: " + e.getMessage());
				System.out.println("Please, inform a valid value!\n");
			} 
		}while(!isValidChoice);
		return employeeMainMenuChoice;
	}

	public void showEmployeeStudentMenu() {
		separator();
		System.out.println("Student Management");
		separator();
		System.out.println("1) Insert New");
		System.out.println("2) List All");
		System.out.println("3) Update One");
		System.out.println("4) Delete One");
		System.out.println("5) Exit\n");
		employeeController.menuEmployeeStudentChoice(getEmployeeStudentChoice());
	}
	/**
	 * Method for get and validate the EmployeeStudent choice
	 * @return employeeStudentChoice
	 */
	private int getEmployeeStudentChoice() {
		String employeeStudentChoiceStr;
		int employeeStudentChoice = -1;
		Boolean isValidChoice = false;
		
		do {
			try {
				System.out.print("Inform your choice: ");
				employeeStudentChoiceStr = input.nextLine();
				employeeStudentChoice = Integer.parseInt(employeeStudentChoiceStr);
				if(employeeStudentChoice < 1 || employeeStudentChoice > 5) {
					throw new Exception("Invalid value!");
				}
				isValidChoice = true;
			} 
			catch (Exception e) {
				System.out.println("\nError: " + e.getMessage());
				System.out.println("Please, inform a valid value!\n");
			}
		} while(!isValidChoice);
		return employeeStudentChoice;
	}

	private void separator() {
		System.out.println("\n-----------------------------------------------\n");
	}

	public void exitApp() {
		separator();
		System.out.println("Bye Bye for now!");
		System.exit(0);
	}

	public String getStudentCpf() {
		separator();
		String cpf = null;
		do{
			System.out.print("Inform the cpf: ");
			cpf = input.next() + input.nextLine();			
		} while(cpf == null);
		return cpf;
	}

	public void showEmployeeBookMenu() {
		// TODO Auto-generated method stub
		
	}

	public void showEmployeeRentMenu() {
		// TODO Auto-generated method stub
		
	}
}
