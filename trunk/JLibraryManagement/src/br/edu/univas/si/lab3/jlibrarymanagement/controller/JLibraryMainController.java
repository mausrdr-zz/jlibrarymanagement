package br.edu.univas.si.lab3.jlibrarymanagement.controller;

import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryEmployeeDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryEmployeeView;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryMainView;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryStudentView;

public class JLibraryMainController {
	private JLibraryEmployeeDAO employeeDao;
	private JLibraryStudentDAO studentDao;
	private JLibraryMainView mainView;
	private JLibraryEmployeeView employeeView;
	private JLibraryStudentView studentView;
	
	public JLibraryMainController(JLibraryEmployeeDAO employeeDao, JLibraryStudentDAO studentDao){
		this.employeeDao = employeeDao;
		this.studentDao = studentDao;
		this.mainView = new JLibraryMainView(this);
	}
	public void initialize(){
		mainView.showMainMenu();
	}
	
	public void mainInitialize() {
		mainView.showMainMenu();
	}
	public void mainMenu(Integer option){
		
		switch(option){
		case 1:
				employeeView.showEmployeeMainMenu();
				
			break;
		case 2:
				studentView.showMainStudent();
			break;
			
		}
		
		
	}
}
