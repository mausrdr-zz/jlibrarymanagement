package br.edu.univas.si.lab3.jlibrarymanagement.view;

import java.util.Scanner;

import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryStudentController;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentTO;

public class JLibraryStudentView {
	
	private JLibraryStudentController controller;
	private Scanner input;
	
	public JLibraryStudentView (JLibraryStudentController c){
		this.controller=c;
		input = new Scanner(System.in);
		
	}
	public void showMainStudent(){
		System.out.println("1) Reserv Book");
		System.out.println("2) Consult Book");
		controller.menuStudent(getUser());
		
	}	
		
	
	private int getUser() {
		String userchoice;
		int option = 0;
		Boolean validad = false;
		do{
		try{
			System.out.println("Inform option:");
			userchoice=input.nextLine();
			option=Integer.parseInt(userchoice);
			if(option <1 || option >2){
				throw new Exception("Value invalid");
			}
			validad=true;
			
		}
		catch (Exception e) {
			System.out.println("Inform valid value !");
		}
		}while(validad);
		return option;
	}
	public String searchBook(){
		System.out.println("Inform name Book:");
		String bookname = getLine();
		
		return bookname;
	}
	private String getLine() {
		
		return input.next()+input.nextLine();
	}
}
