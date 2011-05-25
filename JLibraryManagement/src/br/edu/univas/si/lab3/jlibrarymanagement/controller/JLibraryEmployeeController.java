package br.edu.univas.si.lab3.jlibrarymanagement.controller;

import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryEmployeeDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryEmployeeView;

public class JLibraryEmployeeController {
	
	private JLibraryEmployeeDAO employeeDao;
	private JLibraryEmployeeView employeeView;
	
	public JLibraryEmployeeController(JLibraryEmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
		this.employeeView = new JLibraryEmployeeView(this);
	}
	
	public void employeeInitialize() {
		employeeView.showEmployeeStudentMenu();
	}
	
	public void menuEmployeeStudentChoice(int employeeStudentChoice) {
		switch(employeeStudentChoice) {
			case 1:
				addNew();
			break;
			
			case 2:
				listAll();
			break;
			
			case 3:
				update();
			break;
			
			case 4:
				delete();
			break;
			
			case 5:
				employeeView.showEmployeeMainMenu();
			break;
		}
	}

	private void delete() {
		String cpf = employeeView.getStudentCpf();
		employeeDao.delete(cpf);
	}

	private void update() {
		// TODO Auto-generated method stub
		
	}

	private void listAll() {
		// TODO Auto-generated method stub
		
	}

	private void addNew() {
		// TODO Auto-generated method stub
		
	}

	public void menuEmployeeMainMenuChoice(int employeeMainMenuChoice) {
		switch(employeeMainMenuChoice) {
			
			case 1:
				employeeView.showEmployeeStudentMenu();
			break;
			
			case 2:
				employeeView.showEmployeeBookMenu();
			break;
			
			case 3:
				employeeView.showEmployeeRentMenu();
			break;
			
			case 4:
				employeeView.exitApp();
		}
	}
}
