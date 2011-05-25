package br.edu.univas.si.lab3.jlibrarymanagement.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryStudentController;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryBooksTO;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentDAO;
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
		System.out.println("Inform the title of the Book:");
		String bookname = getLine();
		
		return bookname;
	}
	
	public void showList(String search){
		ArrayList<JLibraryBooksTO>books = new ArrayList<JLibraryBooksTO>();
		for(JLibraryBooksTO book : books){
			if(book.getName().equalsIgnoreCase(search)){
				System.out.println("Codigo: "+book.getId()+" / name "+book.getName());
			}
			else{
				
			}
			
		}
		System.out.println("No book found ! ");
			showMainStudent();
	}
	private String getLine() {
		
		return input.next()+input.nextLine();
	}
}
