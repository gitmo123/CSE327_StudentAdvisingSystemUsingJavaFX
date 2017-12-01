package codes;

import java.util.LinkedList;

public class studentlist {
	
	private final LinkedList<student> sList;
	
	public studentlist() {
		
		sList = new LinkedList<>();
		
		sList.add(new student("1410194642","1234"));
		
		sList.add(new student("1510194642","1234"));
		
		sList.add(new student("1610194642","1234"));
		
		sList.add(new student("1210194642","1234"));
		
		
	}
	
	student getStudentList(String ID) {
		
		student s = null;
		for(int i = 0;i<sList.size();i++) {
			if(sList.get(i).equals(ID)) {
				
				s = sList.get(i);
				break;
				
			}
			
			
		}
	
		return s;
	}
	
	
	

}
