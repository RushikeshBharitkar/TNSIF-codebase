package day3;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Example of for loop
for ( int i=1; i<=100; i++){
	System.out.println("the value of i is ...."+i);
}
//Example of the while loop
int a=10;
while( a<=100){
	System.out.println("the value of a is ...."+a);
	a++;
}
//Example of the do while loop
int s=1;
do{
	System.out.println(s);
	s++;
}while(s<=12);
//Example of for each loop
int a1[]={10,20,30,40,50};

for(int i:a1){
	System.out.print(i+" ");
}
	}

}
