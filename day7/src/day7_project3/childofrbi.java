package day7_project3;

public class childofrbi extends rbi{
   public float getrateofintrest(){
	   System.out.println("base rate for home loan");
	   return 7.7f;
	   // if dt is int then it will give error because return type should be same as thar of parent class
	   //we can change it by something you have to search by coverant overriding
   }
}
