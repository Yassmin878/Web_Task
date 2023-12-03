package Model;


public class Employee {
	private String first_name;
	private String last_name;
	private String country;
	private String password;
	private String phone_number;
	private String email;
	public Employee() {
		
	}
	public Employee(String first_name, String last_name, String country, String password, String phone_number,
			String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.country = country;
		this.password = password;
		this.phone_number = phone_number;
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
