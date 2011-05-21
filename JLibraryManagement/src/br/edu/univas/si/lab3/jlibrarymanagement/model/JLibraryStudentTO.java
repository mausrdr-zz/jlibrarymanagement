package br.edu.univas.si.lab3.jlibrarymanagement.model;

public class JLibraryStudentTO {
	private Integer id;
	private String name;
	private String address;
	private String email;
	private String phone;
	private String cpf;
	private String password;
	private String universityStudy;
	private String schollYear;
	private Boolean delayed;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUniversityStudy() {
		return universityStudy;
	}
	public void setUniversityStudy(String universityStudy) {
		this.universityStudy = universityStudy;
	}
	public String getSchollYear() {
		return schollYear;
	}
	public void setSchollYear(String schollYear) {
		this.schollYear = schollYear;
	}
	public Boolean getDelayed() {
		return delayed;
	}
	public void setDelayed(Boolean delayed) {
		this.delayed = delayed;
	}
	

}
