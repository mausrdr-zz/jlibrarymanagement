package br.edu.univas.si.lab3.jlibrarymanagement.controller;

import java.util.ArrayList;

import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryEmployeeDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentTO;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryEmployeeView;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryMainView;

public class JLibraryEmployeeController {
	
	private JLibraryEmployeeDAO employeeDao;
	private JLibraryEmployeeView employeeView;
	private JLibraryMainView mainView;
	
	public JLibraryEmployeeController(JLibraryEmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
		this.employeeView = new JLibraryEmployeeView(this);
		this.mainView = new JLibraryMainView(this);
	}
	
	public void employeeInitialize() {
		employeeView.showEmployeeMainMenu();
	}
	
	public void menuEmployeeStudentChoice(int employeeStudentChoice) {
		switch(employeeStudentChoice) {
			case 1:
				addNewStudent();
			break;
			
			case 2:
				listAllStudent();
			break;
			
			case 3:
				employeeView.showEmployeeStudentUpdateMenu();
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
		Integer id = employeeView.getStudentId();
		employeeDao.delete(id);
	}

	private void updateStudentName() {
		Integer id = employeeView.getStudentId();
		JLibraryStudentTO student = employeeDao.getById(id);
		if(student != null) {
			employeeDao.update(employeeView.getUpdateStudentInfo(student));
		}
		else {
			System.out.println("Can't update the contact");
		}
	}

	private void listAllStudent() {
		ArrayList<JLibraryStudentTO> students = employeeDao.getList();
		if(students.size() > 0) {
			employeeView.showList(students);
		}
		else {
			System.out.println("The Student list does not exists!!");
		}
	}

	private void addNewStudent() {
		JLibraryStudentTO student = employeeView.getStudentInfo();
		if(student != null) {
			employeeDao.create(student);
		}
		else {
			System.out.println("Was not possible create the record!");
		}
		employeeView.showEmployeeStudentUpdateMenu();
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
				mainView.showMainMenu();
			break;
		}
	}

	public void menuEmployeeStudentUpdateMenu(int employeeStudentUpdateChoice) {
		switch(employeeStudentUpdateChoice) {
			case 1:
				updateStudentName();
			break;
			
			case 2:
				updateStudentAddress();
			break;
		}
	}

	private void updateStudentAddress() {
		// TODO Auto-generated method stub
		
	}
}
