package br.edu.univas.si.lab3.jlibrarymanagement.controller;

import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentTO;
import br.edu.univas.si.lab3.jlibrarymanagement.view.JLibraryView;

public class JLibraryController {
	private JLibraryDAO dao;
	private JLibraryView view;
	
	public JLibraryController(JLibraryDAO dao){
		this.dao= dao;
		this.view = new JLibraryView(this);
	}
	private void addNew(){
		JLibraryStudentTO student = view.getStudent();
		if(student != null){
			dao.create(student);
		}
	}
}
