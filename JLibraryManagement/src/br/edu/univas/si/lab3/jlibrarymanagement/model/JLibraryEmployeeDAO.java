package br.edu.univas.si.lab3.jlibrarymanagement.model;

import java.util.ArrayList;

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

	public void delete(String cpf) {
		Integer index = 0, employeeStudentIndex = null;
		for(JLibraryStudentTO student : studentList) {
			if(student.getCpf().equalsIgnoreCase(cpf)) {
				employeeStudentIndex = index;
				break;
			}
			index ++;
		}
		if(employeeStudentIndex != null) {
			studentList.remove(employeeStudentIndex);
		}
	}
}
