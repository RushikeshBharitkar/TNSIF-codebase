package day5_project2;

// multiple inheritance and hybrid cant achive at class level in java they can access tgrough interface
// example of single inheritance
//parent class
public class citizen {
private String name;
private String adharno;
private String address;
private long phone;
//default
public citizen() {
	System.out.println("citizen object created");
}
//parametrized
public citizen(String name, String adharno, String address, long phone) {
	super();
	this.name = name;
	this.adharno = adharno;
	this.address = address;
	this.phone = phone;
}
//geter seter
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdharno() {
	return adharno;
}
public void setAdharno(String adharno) {
	this.adharno = adharno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
//to string
public String toString() {
	return "citizen [name=" + name + ", adharno=" + adharno + ", address="
			+ address + ", phone=" + phone + "]";
}







}

