package br.edu.univas.si.lab3.jlibrarymanagement.view;

import java.util.Scanner;

import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryEmployeeController;
import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryMainController;

public class JLibraryMainView {
	private JLibraryMainController mainController;
	private JLibraryEmployeeController employeeController;
	private Scanner input;
	
	public JLibraryMainView(JLibraryMainController m) {
		this.mainController = m;
		input = new Scanner(System.in);
	}

	public JLibraryMainView(JLibraryEmployeeController e) {
		this.employeeController = e;
		input = new Scanner(System.in);
	}

	public void showMainMenu() {
		separator();
		System.out.println("Main Menu");
		separator();
	}

	private void separator() {
		System.out.println("\n----------------------------------------\n");
	}

}
