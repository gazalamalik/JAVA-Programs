import java.util.*;

class ChildOne implements Runnable{
  public void run(){
	  for(int i = 0 ; i< 5; i ++){
		System.out.println("child One ");
		
	  }
   }
}
class ChildTwo implements Runnable{
  public void run(){
		for(int i=0; i<10;i ++){
			System.out.println("child two ");
			
		}
	}
}
public class UsingRunnableInt{
	public static void main(String args[]){
		ChildOne t1= new ChildOne();
		ChildTwo t2= new ChildTwo();
		
		Thread manager= new Thread (new ChildOne());
		manager.start();
		
		for(int i=0; i<10; i++){
			System.out.println("main thread ");
		}
		
	}
}	
	

