package br.edu.univas.si.lab3.jlibrarymanagement.model;

import java.util.ArrayList;

public class JLibraryEmployeeDAO {
	private ArrayList<JLibraryEmployeeTO> employeeList;
	
	public JLibraryEmployeeDAO() {
		employeeList = new ArrayList<JLibraryEmployeeTO>();
	}
	
	public void create(JLibraryEmployeeTO employee) {
		employeeList.add(employee);
	}
}
