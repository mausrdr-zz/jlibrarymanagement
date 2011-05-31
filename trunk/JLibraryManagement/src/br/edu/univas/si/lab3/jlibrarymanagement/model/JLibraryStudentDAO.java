package br.edu.univas.si.lab3.jlibrarymanagement.model;

import java.util.ArrayList;

public class JLibraryStudentDAO {
	
	private ArrayList<JLibraryStudentTO> studentList;
	private ArrayList<JLibraryBooksTO>bookList;
	
	
	
	public JLibraryStudentDAO(){
		studentList = new ArrayList<JLibraryStudentTO>();
		bookList = new ArrayList<JLibraryBooksTO>();
	}
	public void create(JLibraryStudentTO student){
		studentList.add(student); 
	}
	public ArrayList<JLibraryStudentTO>getListStudent(){
		return (ArrayList<JLibraryStudentTO>) studentList.clone();
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
	
		
}