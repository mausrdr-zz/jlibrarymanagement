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
	
	public void showEmployeeMenu() {
		separator();
		System.out.println("Employee Management");
		separator();
		System.out.println("1) Create");
	}

	private void separator() {
		// TODO Auto-generated method stub
		
	}
}
