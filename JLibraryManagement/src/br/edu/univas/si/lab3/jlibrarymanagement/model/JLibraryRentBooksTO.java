package br.edu.univas.si.lab3.jlibrarymanagement.model;

public class JLibraryRentBooksTO {

		private String bookName;
		private String studentName;
		private Integer bookId;
		private Integer studentId;
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public Integer getBookId() {
			return bookId;
		}
		public void setBookId(Integer bookId) {
			this.bookId = bookId;
		}
		public Integer getStudentId() {
			return studentId;
		}
		public void setStudentId(Integer studentId) {
			this.studentId = studentId;
		}
		
}
