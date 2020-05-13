package test;

import java.util.Date;

public class student extends person{

	
	String tutgroup;

	
	public student(int code, String name, String lastname, String DoB, String user, String password, String tutgroup) {
		super(code, name, lastname, DoB, user, password, tutgroup);
		this.tutgroup = tutgroup;
	}
	

	public String getTutgroup() {
		return tutgroup;
	}
	public void setTutgroup(String tutgroup) {
		this.tutgroup = tutgroup;
	}
	
	
}
