package br.edu.univas.si.lab3.jlibrarymanagement.controller;

import java.util.ArrayList;

import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryEmployeeDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentTO;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryEmployeeView;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryMainView;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryStudentView;

public class JLibraryEmployeeController {
	
	private JLibraryEmployeeDAO employeeDao;
	private JLibraryEmployeeView employeeView;
	private JLibraryMainView mainView;
	private JLibraryStudentDAO studentDao;
	
	
	public JLibraryEmployeeController(JLibraryEmployeeDAO employeeDao) {
		this.employeeDao =  employeeDao;
		this.employeeView = new JLibraryEmployeeView(this);	
		this.mainView = new JLibraryMainView(this);
		this.studentDao = new JLibraryStudentDAO();
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
				mainView.showMainMenu();
			break;
			
			case 4:
				delete();
				mainView.showMainMenu();
				//TODO verificar erro depois de deletar student. ao clicar no menu principal dá erro
				
			break;
			
			case 5:
				employeeView.showEmployeeMainMenu();
			break;
		}
	}

	private void delete() {
		Integer id = employeeView.getStudentId();
		studentDao.delete(id);
	}

	private void updateStudentName() {
		Integer id = employeeView.getStudentId();
		JLibraryStudentTO student = studentDao.getById(id);
		if(student != null) {
			studentDao.update(employeeView.getUpdateStudentInfo(student));
		}
		else {
			System.out.println("Can't update the contact");
		}
	}

	private void listAllStudent() {
		ArrayList<JLibraryStudentTO> students = studentDao.getListStudent();
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
			
			studentDao.create(student);
			
		}
		else {
			System.out.println("Was not possible create the record!");
		}
		employeeView.showEmployeeMainMenu();
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
			
			case 3:
				updateStudentEmail();
				break;
				
			case 4:
				updateStudentPhone();
				break;
				
			case 5:
				updateStudentCpf();
				break;
				
			case 6:
				updateStudentPassword();
				break;
				
			case 7:
				updateStudentSchollYear();
				break;
				
			case 8:
				break;
				
		}
	}
	public void menuEmployeeBookChoice(int menuEmployeeBook){
		switch(menuEmployeeBook){
		case 1:
			addBook();
			break;
		case 2:
			updateBook();
			break;
		case 3:
			updateStok();
			break;
		case 4:
			break;
		}
	}

	private void updateStok() {
		// TODO Auto-generated method stub
		
	}



	private void updateBook() {
		// TODO Auto-generated method stub
		
	}



	private void addBook() {
		// TODO Auto-generated method stub
		
	}



	private void updateStudentPassword() {
		// TODO Auto-generated method stub
		
	}



	private void updateStudentSchollYear() {
		// TODO Auto-generated method stub
		
	}



	private void updateStudentCpf() {
		// TODO Auto-generated method stub
		
	}



	private void updateStudentPhone() {
		// TODO Auto-generated method stub
		
	}



	private void updateStudentEmail() {
		// TODO Auto-generated method stub
		
	}



	private void updateStudentAddress() {
		// TODO Auto-generated method stub
		
	}
}
