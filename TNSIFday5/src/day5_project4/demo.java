package day5_project4;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		person p1=new person();
		System.out.println("------Person Details ------");
		System.out.println(p1);
		
		System.out.println("--------------------------");
		//Student s=new Student();
		person p;
		p=new person("Shubham", "mumbai");
		System.out.println("Person Details "+ p);
		
		p=new studentss("Sunil", 67.89f, "SY", "Nashik");
		System.out.println("Students details "+ p);
		
		p=new employee(121,12345,"cs","rushi","pune");
		System.out.println("employee details "+ p);
		

	}

}
