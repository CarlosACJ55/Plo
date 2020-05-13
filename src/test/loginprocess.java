package test;

import java.util.LinkedList;

public class loginprocess {

	static LinkedList<teacher> Teacher_List = new LinkedList<teacher>();
	static LinkedList<student> Student_List = new LinkedList<student>();
	
	
	public void initialize () {
		
		
		student myTeacher1 = new student(01, "Pheello", "Tlali", "16September", "pheello.tlali", "123", "6BT");
	
		
		//Add to my List
		Student_List.add(myTeacher1);
	
		
		
		
	}
	
	
	public static int find_user_and_password(
			String txtUser,
			String txtPassword
			
			)
	{
		//Find the index with the code given
		int index=-1;
		if(!Student_List.isEmpty()){
			for(int i = 0;i<Student_List.size();i++) {
				if(Student_List.get(i).getUser().equals(txtUser) && Student_List.get(i).getPassword().equals(txtPassword)) {
					 index=i;
					 break;
				}
			}
		}
		
		//if the code is not found, the return value will be -1
		return index;
	}

}

	

