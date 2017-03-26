package test.spring.sogeti.models;

public class user {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", password=" + password + "]";
	}
	String name;
	String password;
		
	public user(){
	}
	
}


