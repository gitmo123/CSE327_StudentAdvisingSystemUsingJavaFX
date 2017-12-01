package codes;

public class student {
	
	private String ID;
	private String password;
	
	public student(String ID,String password) {
		
		this.ID=ID;
		this.password=password;
		
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
