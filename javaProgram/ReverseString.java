import java.util.*;

public class ReverseString{
	
	public static void main(String args []){
		String ori;
		String rev= " ";
		Scanner sc= new Scanner (System.in);
		ori= sc.nextLine();
		
		int len = ori.length();
		
		
		for(int i= len-1; i>=0;i--){
			rev = rev + ori.charAt(i);
			
			System.out.println("original String " + ori);
			System.out.println("reverse string " + rev);
			
		}
		
	}


}