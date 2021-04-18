import java.util.*;

public class UsingThreadClass extends Thread {
	
	public void run(){
		for(int i=0; i <10; i++){
			System.out.println("Child One ");
			
		}
	}
	public static void main(String arg[]){
		Thread t= Thread.currentThread();
		System.out.println("getting thread name using method :" + t.getName());
		
		UsingThreadClass  c = new UsingThreadClass();
		c.start();
		for(int i=0; i<10; i++){
			System.out.println("mainb thread ");
			
		}
		
		
		
	}
	
}