package day4;

import java.util.Scanner;

public class constructordemo {

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
