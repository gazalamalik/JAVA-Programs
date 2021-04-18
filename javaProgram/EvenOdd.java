import java.util.*;
public class EvenOdd{
	
public static void main (String arg[]){
   Scanner sc= new Scanner(System.in);
   System.out.println("enyter the number");
   int count=sc.nextInt(); 
  
   for(int i=0; i <=count; i ++){
	   
	    if(i%2==0){
			System.out.print(i+ " ");
			
		}
   }
   System.out.println(" ");
   
   System.out.println("*******************");
   for(int i=1; i <=count; i ++){
	   
	    if(i%2 !=0){
			System.out.println("odd number : " + i);
			
		}
   }
  
   
   
}

}