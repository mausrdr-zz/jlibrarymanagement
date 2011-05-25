package br.edu.univas.si.lab3.jlibrarymanagement.controller;

import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryEmployeeDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryMainView;

public class JLibraryMainController {
	private JLibraryEmployeeDAO employeeDao;
	private JLibraryStudentDAO studentDao;
	private JLibraryMainView mainView;
	
	public JLibraryMainController(JLibraryEmployeeDAO employeeDao, JLibraryStudentDAO studentDao){
		this.employeeDao = employeeDao;
		this.studentDao = studentDao;
		this.mainView = new JLibraryMainView(this);
	}
	
	public void mainInitialize() {
		mainView.showMainMenu();
	}
}
