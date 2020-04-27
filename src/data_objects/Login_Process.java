package data_objects;

import java.util.LinkedList;

public class Login_Process {

	static LinkedList<Teacher> Teacher_List = new LinkedList<>();
	static LinkedList<Student> Student_List = new LinkedList<>();
	
	public void initialize () {
		
		Teacher myTeacher1 = new Teacher();
		Teacher myTeacher2 = new Teacher();
		
		myTeacher1.setCode("MC01");
		myTeacher1.setUser("pheello");
		myTeacher1.setPassword("123");
		
		myTeacher2.setCode("MC02");
		myTeacher2.setUser("marlon");
		myTeacher2.setPassword("wololo");

		//Add to my List
		Teacher_List.add(myTeacher1);
		Teacher_List.add(myTeacher2);
		
		
		
	}
	
	
	public static int find_user_and_password(
			String txtUser,
			String txtPassword
			
			)
	{
		//Find the index with the code given
		int index=-1;
		if(!Teacher_List.isEmpty()){
			for(int i = 0;i<Teacher_List.size();i++) {
				if(Teacher_List.get(i).getUser().equals(txtUser) && Teacher_List.get(i).getPassword().equals(txtPassword)) {
					 index=i;
					 break;
				}
			}
		}
		
		//if the code is not found, the return value will be -1
		return index;
	}

}
