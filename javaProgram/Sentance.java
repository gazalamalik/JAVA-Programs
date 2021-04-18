import java.util.*;

class Sentance {
	public static void main (String args []){
		
	//Scanner sc= new Scanner (System.in);
	//System.out.println("Enter a sentance ");
	
	try {
		System.out.println("this is exception ");
		
		System.out.println(100/0);
		
	}
	catch (Exception e ){
		System.out.println(e);
		//System.out.println(100/2);
		
		
	}
	
	finally {
		System.out.println("Finally block ");
	}
	int a;int b ;
	System.out.println();
	
	//String str= sc.Next();
	String str [] = {"Java Programming " , "Malik" , "jammi"};
	System.out.println(str);
	
	
	//for(int i=0; i <= str.length; i++){
		
	System.out.println(str.length);
	
	//}
	}

}