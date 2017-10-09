package code;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person() {
		this.firstName = "";
		this.lastName = "";
	}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Hi my name is " + this.firstName + " " + this.lastName + ". Nice to meet you!";
	}
}
