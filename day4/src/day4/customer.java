// a constructor in java is a special method that is used to intialize objects and variables
// the construcctor is called when the object of hte class  is created
//rule to decleare constructor
//1 constructor name should be same as tht of class 
package day4;

import java.util.Scanner;

public class customer {
	private String customername;
	private int customerid;
	private String customercity;
	
	//default constructor
	public customer(){
		System.out.println(" this is default constructor");
	}
//parametrized constructor
	// works like a setter method
	public customer(String customername, int customerid, String customercity) {
	//this(); //calling default constructor
		System.out.println(" this is parametrized constructor");
		this.customername = customername;
		this.customerid = customerid;
		this.customercity = customercity;
	}
	// getter seter method

	public String toString() {
		return "customer [customername=" + customername + ", customerid="
				+ customerid + ", customercity=" + customercity + "]";
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("enter coustomer id");
		id=sc.nextInt();
		
		System.out.println("enter coustomer name");
		name=sc.next();

		System.out.println("enter coustomer city");
		city=sc.next();
		
		System.out.println(" ");
		
		customer c1=new customer();// default
		//c1.setCustomercity(city);
		//c1.setCustomerid(id);
		//c1.setCustomername(name);
		//System.out.print(c1);
		
		
		customer c2=new customer(name,id,city);
		c2.setCustomercity(city);
		c2.setCustomerid(id);
		c2.setCustomername(name);
		System.out.println(c2);
		

	}

}
