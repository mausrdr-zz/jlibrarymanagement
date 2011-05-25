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
	public ArrayList<JLibraryStudentDAO>getListStudent(){
		return (ArrayList<JLibraryStudentDAO>) studentList.clone();
	}
	
		
}