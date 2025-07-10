package day7_project3;

public class overiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           rbi rb;
           //dynamic binding assiging child object to parent class referance variable
           
           rb=new childofrbi();
           System.out.println(rb.getrateofintrest());
           
           rb=new rbi();
           System.out.println(rb.getrateofintrest());
           
           rb=new secondndchildofrbi();
           System.out.println(rb.getrateofintrest());
	}

}
