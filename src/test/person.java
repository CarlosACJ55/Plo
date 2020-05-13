package test;

import java.util.Date;

public class person {
	
	int code;
	String name;
	String last_name;
	String DoB;
	String user;
	String password;
	
	
	
	public person(int code, String name, String last_name, String doB, String user, String password, String tutgroup) {
		super();
		this.code = code;
		this.name = name;
		this.last_name = last_name;
		DoB = doB;
		this.user = user;
		this.password = password;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDoB() {
		return DoB;
	}
	public void setDoB(String doB) {
		this.DoB = doB;
	}
	
	
	
	
	
	

}
