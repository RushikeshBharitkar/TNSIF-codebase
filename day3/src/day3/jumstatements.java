package day3;

public class jumstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Example of the jump statements
		//here we are printing even numbers
		// continuse statement skip the itration
       for(int k=5; k<15;k++){
    	   if(k%2 !=0){
    		   continue;
    	   }
    	   System.out.println(k+" ");
       }
       //Example of Break stament 
       // comes out from the loop and stop the rotation
       for(int k=5; k<15;k++){
    	   if(k%2==0){
    		   break;
    	   }
    	   System.out.println(k+" ");
    	//example of Switc case
    	   int userinput=7;
    	   switch(userinput){
    	   case 1:System.out.println(" current recharge details");
    	   break;
    	   case 2:System.out.println(" current recharge expiary");
    	   break;
    	   case 3:System.out.println(" current mobile details");
    	   break;
    	   case 4:System.out.println(" current offers");
    	   break;
    	   default:System.out.println(" current pack details");
    	 
    	   }
       }
	}

}
