package br.edu.univas.si.lab3.jlibrarymanagement.controller;


import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentTO;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryMainView;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryStudentView;

public class JLibraryStudentController {
	private JLibraryStudentDAO dao;
	private JLibraryStudentView studentView;
	private JLibraryStudentController maincontroller;
	private JLibraryMainView mainView;
	
	public JLibraryStudentController(JLibraryStudentDAO dao){
		this.dao= dao;
		this.studentView = new JLibraryStudentView(this);
		this.mainView = new JLibraryMainView(this);
		
	}
	
	
	public void menuStudent(int option){
		switch(option){
		
		case 1:
			reservBook();
			break;
		case 2:
			consultBook();	
			break;
		case 3:
			mainView.showMainMenu();
			break;
			
					
		}
		
	}

	private void reservBook() {
				//TODO IMPLEMENTAR RESERVAS DE LIVROS
	}

	private void consultBook() {
		String pesquisa = studentView.searchBook();
		studentView.showList(pesquisa);
		
		
	}
	

}
