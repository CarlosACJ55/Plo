package data_objects;

public class Teacher extends Person {
	
	String teacher_type;
	String teacher_position;
	String teacher_nationality;
	
	public String getTeacher_type() {
		return teacher_type;
	}
	public void setTeacher_type(String teacher_type) {
		this.teacher_type = teacher_type;
	}
	public String getTeacher_position() {
		return teacher_position;
	}
	public void setTeacher_position(String teacher_position) {
		this.teacher_position = teacher_position;
	}
	public String getTeacher_nationality() {
		return teacher_nationality;
	}
	public void setTeacher_nationality(String teacher_nationality) {
		this.teacher_nationality = teacher_nationality;
	}
	

}
