package day5_project2;
// child class
public class students extends citizen {
	private int rollno;
	private String clgname;
	//default constructor
	public students() {
		super();// because i have super class citizen
	}
	//to string
	
	
//geter setteer
	public int getRollno() {
		return rollno;
	}

	

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getClgname() {
		return clgname;
	}

	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	//to stribg
	public students(int rollno, String clgname,String name, String adharno, String address, long phone) {
		super( name,  adharno,  address,  phone);
		this.rollno = rollno;
		this.clgname = clgname;
	}


	public String toString() {
		return "students [rollno=" + rollno + ", clgname=" + clgname
				+ ", getName()=" + getName() + ", getAdharno()=" + getAdharno()
				+ ", getAddress()=" + getAddress() + ", getPhone()="
				+ getPhone() + "]";
	}
	


	

}
