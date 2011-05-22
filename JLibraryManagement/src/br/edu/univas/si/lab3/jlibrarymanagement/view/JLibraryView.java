package br.edu.univas.si.lab3.jlibrarymanagement.view;

import java.util.Scanner;

import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryController;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentTO;

public class JLibraryView {
	
	private JLibraryController controller;
	private Scanner input;
	
	public JLibraryView (JLibraryController c){
		this.controller = c;
		input = new Scanner(System.in);
		
	}
	public JLibraryStudentTO getStudent(){
		JLibraryStudentTO student = new JLibraryStudentTO();
		System.out.println("Add Student");
		System.out.println("Id:");
		student.setId(input.nextInt());
		System.out.println("Password:");
		student.setPassword(getLine());
		System.out.println("Name:");
		student.setName(getLine());
		System.out.println("Address:");
		student.setAddress(getLine());
		System.out.println("Phone:");
		student.setPhone(getLine());
		System.out.println("Cpf:");
		student.setCpf(getLine());
		System.out.println("University Study");
		student.setUniversityStudy(getLine());
		System.out.println("Scholl year");
		student.setSchollYear(getLine());
		
		return student;
		
	}
	private String getLine() {
		
		return input.next()+input.nextLine();
	}
}
