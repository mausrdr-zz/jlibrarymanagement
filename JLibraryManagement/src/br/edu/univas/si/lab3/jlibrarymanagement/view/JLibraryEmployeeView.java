package br.edu.univas.si.lab3.jlibrarymanagement.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryEmployeeController;
import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryMainController;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentTO;

public class JLibraryEmployeeView {
	
	private JLibraryEmployeeController employeeController;
	private Scanner input;
	private JLibraryMainView mainView; 
	
	
	

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
		System.out.println("4) Return to Main Menu\n");
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
		System.out.println("5) Return to Employee Main Menu\n");
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

	public Integer getStudentId() {
		separator();
		Integer id = null;
		do{
			System.out.print("Inform the ID: ");
			id = input.nextInt();			
		} while(id == null);
		return id;
	}

	public void showEmployeeBookMenu() {
		separator();
		System.out.println("Show Book Menu");
		separator();
		System.out.println("1) Add Book");
		System.out.println("2) Update Book");
		System.out.println("3) Update Stok");
		System.out.println("4) Return to Main Menu");
		employeeController.menuEmployeeBookChoice(getEmployeeStudentChoice());
		
	}

	public void showEmployeeRentMenu() {
		// TODO Auto-generated method stub
		
	}

	public JLibraryStudentTO getUpdateStudentInfo(JLibraryStudentTO student) {
		separator();
		System.out.print("Inform new name: ");
		student.setName(input.next() + input.nextLine());
		return student;
	}

	public void showEmployeeStudentUpdateMenu() {
		separator();
		System.out.println("Update Student Info");
		separator();
		System.out.println("1) Update Name");
		System.out.println("2) Update Address");
		System.out.println("3) Update E-mail");
		System.out.println("4) Update Phone");
		System.out.println("5) Update CPF");
		System.out.println("6) Update Password");
		System.out.println("7) Update School Year");
		System.out.println("8) Return to Student Management Menu");
		employeeController.menuEmployeeStudentUpdateMenu(getEmployeeStudentUpdateChoice());
		
	}

	private int getEmployeeStudentUpdateChoice() {
		String employeeStudentUpdateChoiceStr;
		int employeeStudentUpdateChoice = -1;
		Boolean isValidChoice = false;
		
		do {
			try {
				System.out.print("Inform your choice: ");
				employeeStudentUpdateChoiceStr = input.nextLine();
				employeeStudentUpdateChoice = Integer.parseInt(employeeStudentUpdateChoiceStr);
				if(employeeStudentUpdateChoice < 1 || employeeStudentUpdateChoice > 8) {
					throw new Exception("Invalid value!");
				}
				isValidChoice = true;
			}
			catch (Exception e) {
				System.out.println("\nError: " + e.getMessage());
				System.out.println("Please, inform a valid value!\n");
			}
		}while(!isValidChoice);
		return employeeStudentUpdateChoice;
	}

	public void showList(ArrayList<JLibraryStudentTO> students) {
		for(JLibraryStudentTO s : students) {
			separator();
			System.out.println("ID: " + s.getId());
			System.out.println("Name: " + s.getName());
			System.out.println("Address: " + s.getAddress());
			System.out.println("Email: " + s.getEmail());
			System.out.println("Phone: " + s.getPhone());
			System.out.println("CPF: " + s.getCpf());
			System.out.println("University Course: " + s.getUniversityStudy());
			System.out.println("Scholl Year: " + s.getSchollYear());
		}
	}

	public JLibraryStudentTO getStudentInfo() {
		JLibraryStudentTO student = new JLibraryStudentTO();
		System.out.println("ID:"); 
		student.setId(input.nextInt());
		System.out.println("Name:"); 
		student.setName(input.next()+input.nextLine());
		System.out.println("Address:");
		student.setAddress(input.next()+input.nextLine());
		System.out.println("Email:");
		student.setEmail(input.next()+input.nextLine());
		System.out.println("Phone:");
		student.setPhone(input.next()+input.nextLine());
		System.out.println("CPF:");
		student.setCpf(input.next()+input.nextLine());
		System.out.println("University Course:");
		student.setUniversityStudy(input.next()+input.nextLine());
		System.out.println("Scholl Year:");
		student.setSchollYear(input.next()+input.nextLine());
		
		return student;
		
	}
}
