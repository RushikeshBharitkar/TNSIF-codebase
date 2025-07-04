package day5_project4;

public class person {
//hirechical
	private String name;
	private String city;
	public person() {
		System.out.println("person class defaults value");
		name="rushi";
		city= "sinnar";
		
	}
	public person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	//geter seter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//to string
	public String toString() {
		return "person [name=" + name + ", city=" + city + "]";
	}
	
	
}
