package br.edu.univas.si.lab3.jlibrarymanagement.view;

import java.util.Scanner;

import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryEmployeeController;
import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryMainController;
import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryStudentController;

public class JLibraryMainView {
	private JLibraryMainController mainController;
	private JLibraryEmployeeController employeeController;
	private JLibraryStudentController studentController;
	private Scanner input;
	private JLibraryEmployeeView employeeView;
	
	public JLibraryMainView(JLibraryMainController m) {
		this.mainController = m;
		input = new Scanner(System.in);
	}
	public JLibraryMainView(JLibraryEmployeeController e){
		this.employeeController = e;
		input = new Scanner(System.in);
		
	}
	public JLibraryMainView(JLibraryStudentController s){
		this.studentController = s;
	}
	public JLibraryMainView(JLibraryEmployeeView ev){
		this.employeeView =ev;
	}

	
	public void showMainMenu() {
		separator();
		System.out.println("Main Menu");
		separator();
		System.out.println("1) Employee");
		System.out.println("2) Student");
		System.out.println("3) Admin");
		mainController.mainMenu(getUser());
		
		
	}

	
		private int getUser() {
			String userchoice;
			int option = -1;
			Boolean validad = false;
			do{
			try{
				System.out.println("Inform option:");
				userchoice=input.next()+input.nextLine();
				option=Integer.parseInt(userchoice);	
				if(option <1 || option >3){
					
					throw new Exception("Value invalid");
					
				}
				validad=true;
				
			}
			catch (Exception e) {
				System.out.println("Inform valid value !");
			}
			}while(!validad);
			return option;
		}
	

	private void separator() {
		System.out.println("\n----------------------------------------\n");
	}

}
