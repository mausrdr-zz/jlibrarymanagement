package br.edu.univas.si.lab3.jlibrarymanagement.controller;

import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryEmployeeDAO;
import br.edu.univas.si.lab3.jlibrarymanagement.model.JLibraryStudentDAO;

public class Runner {
	public static void main(String[] args) {
		JLibraryMainController c = new JLibraryMainController(new JLibraryEmployeeDAO(),new JLibraryStudentDAO());
		c.initialize();
	}
}
