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

	public void delete(Integer id) {
		Integer index = 0, employeeStudentIndex = null;
		for(JLibraryStudentTO student : studentList) {
			if(student.getId() == id) {
				employeeStudentIndex = index;
				break;
			}
			index ++;
		}
		if(employeeStudentIndex != null) {
			studentList.remove(employeeStudentIndex);
		}
	}

	public JLibraryStudentTO getById(Integer id) {
		for(JLibraryStudentTO student : studentList) {
			if(student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	public void update(JLibraryStudentTO updateStudentInfo) {
		Integer index = 0, employeeStudentUpdateIndex = null;
		for(JLibraryStudentTO student : studentList) {
			if(student.getId() == updateStudentInfo.getId()) {
				employeeStudentUpdateIndex = index;
				break;
			}
			index++;
		}
		if(employeeStudentUpdateIndex != null) {
			studentList.set(employeeStudentUpdateIndex, updateStudentInfo);
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<JLibraryStudentTO> getList() {
		return (ArrayList<JLibraryStudentTO>) studentList.clone();
	}

	public void create(JLibraryStudentTO student) {
		// TODO Auto-generated method stub
		
	}
}
