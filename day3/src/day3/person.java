package day3;

import java.util.Scanner;

public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner (System.in);
           
           String name ;
           System.out.println("enter your name : ");
           name = sc.next();
           
           int age ;
           System.out.println("enter  your age : ");
           age=  sc.nextInt();
           
           String gender ;
           System.out.println("enter your gender : ");
           gender= sc.next();
           
           int income;
           System.out.println("enter your income : ");
           income = sc.nextInt();
           
           long mobileNumber;
           System.out.println("enter your number : ");
           mobileNumber=sc.nextLong();
           
           
           scanner person = new scanner();
           person.setName(name);
           person.setAge(age);
           person.setGender(gender);
           person.setIncome(income);
           person.setMobilenumber(mobileNumber);
           
           
           System.out.println(person.getName());
           System.out.println(person.getAge());
           System.out.println(person.getGender());
           System.out.println(person.getIncome());
           System.out.println(person.getMobilenumber());
           
           System.out.println("After creating the tax object: ");
           taxcalculater  cal =new  taxcalculater();
           cal.calculateTax(person);
           System.out.println("After the calculation of tax: ");
           		
   		
   		System.out.println(person );
           
	}

}