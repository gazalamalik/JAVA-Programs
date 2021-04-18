import java.util.*;
public class FibboFun{
	// using function or without function 
	
	
	/*public void fibbo(){
		System.out.println("the sum  :" + a);
		
	for(int i =0; i<+count; i++){
		sum= a+b;
		System.out.println("the sum  : " + sum);
		
		b=a;
		a= sum;
		
		
	}
	}*/

public static void main(String str[]){
	int a=0;
	int b=1;
	int sum =0;
	int count= 15;
	
	System.out.println("the number is :" + a);
	FibboFun f= new FibboFun();
	//f.fibbo();
	
     for(int i=0 ; i<=count; i ++){
	 sum=a+b; // sum=1
	 System.out.println("fibbo number is :" + sum);
	 b=a;
	 a=sum;
	 
	 }
	 

}
}