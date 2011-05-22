package br.edu.univas.si.lab3.jlibrarymanagement.model;

import java.util.ArrayList;

public class JLibraryDAO {
	
	private ArrayList<JLibraryStudentTO>studentList;
	
	public JLibraryDAO(){
		studentList = new ArrayList<JLibraryStudentTO>();
	}
	public void create(JLibraryStudentTO student){
		studentList.add(student); 
	}
}