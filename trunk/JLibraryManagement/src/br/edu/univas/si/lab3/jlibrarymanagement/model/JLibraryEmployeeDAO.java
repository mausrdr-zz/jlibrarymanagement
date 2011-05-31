package br.edu.univas.si.lab3.jlibrarymanagement.model;

import java.util.ArrayList;

import br.edu.univas.si.lab3.jlibrarymanagement.controller.JLibraryEmployeeController;

public class JLibraryEmployeeDAO {
	private ArrayList<JLibraryEmployeeTO> employeeList;
	private ArrayList<JLibraryStudentTO> studentList;
	
	
	public JLibraryEmployeeDAO() {
		employeeList = new ArrayList<JLibraryEmployeeTO>();
		studentList = new ArrayList<JLibraryStudentTO>();
		
	}
	
	public void create(JLibraryEmployeeTO employee) {
			employeeList.add(employee);
	}

	@SuppressWarnings("unchecked")
	public ArrayList<JLibraryStudentTO> getList() {
		return (ArrayList<JLibraryStudentTO>) studentList.clone();
	}

	
}
