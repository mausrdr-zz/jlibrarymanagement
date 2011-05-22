package br.edu.univas.si.lab3.jlibrarymanagement.model;

import java.util.Date;

public class JLibraryRentBooksTO {

		private String bookName;
		private String studentName;
		private Integer bookId;
		private Integer studentId;
		private Boolean reserved;
		private Date bookingdate;
		private Date dateOfWithdrawal; 
		private Boolean withdrawn;
		
	
		public Date getDateOfWithdrawal() {
			return dateOfWithdrawal;
		}
		public void setDateOfWithdrawal(Date dateOfWithdrawal) {
			this.dateOfWithdrawal = dateOfWithdrawal;
		}
		public Boolean getWithdrawn() {
			return withdrawn;
		}
		public void setWithdrawn(Boolean withdrawn) {
			this.withdrawn = withdrawn;
		}
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
		public Boolean getReserved() {
			return reserved;
		}
		public void setReserved(Boolean reserved) {
			this.reserved = reserved;
		}
		public Date getBookingdate() {
			return bookingdate;
		}
		public void setBookingdate(Date bookingdate) {
			this.bookingdate = bookingdate;
		}
		
		
		
}
