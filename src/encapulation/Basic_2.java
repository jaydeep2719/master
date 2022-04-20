package encapulation;

public class Basic_2 {
	private String name;
	private int userId;
	private int passWord;
	public void setname(String name) {
		this.name= name;
	}
	public void setUserId(int userId) {
		this.userId=userId;
	}
	public void setPassword(int password) {
		this.passWord=password;
	}
	public String getM1() {
		return name;
	}
	public int getM2() {
		return userId;
	
	}
	public int getM3() {
		return passWord;
	}

}
