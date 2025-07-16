package Thread;

public class ThreadLifecycleDemo {
             public void run() {
            	 System.out.println("in side run() thread is alive or not"+this.isAlive());
             }

			 String isAlive() {
				// TODO Auto-generated method stub
				return null;
			 }
			 int num=0;{
			 while(num<4) {
				 num++;
				 System.out.println("num="+num);
			 }
			 try {
				 sleep(500);
				 System.out.println("in the runnable state"+this.isAlive());
			 }
			 catch(InterruptedException e) {
			      System.err.println();
			 }}
			 private void sleep(int i) {
				// TODO Auto-generated method stub
				
			 }
			 
}
