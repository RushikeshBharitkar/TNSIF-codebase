package day5_project1;

public class person11 {
	//
	
	private String name;
	private Address12 address;
	  
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Address12 getAddress() {
		return address;
	}




	public void setAddress(Address12 address) {
		this.address = address;
	}




	public person11(String name, Address12 address) {
		super();
		this.name = name;
		this.address = address;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void display(){
		System.out.println("name :"+name);
		System.out.println("address :"+address.getStreet()+address.getState()+address.getPostalcode()+address.getCity());
	}




	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}
	

}
