import java.util.*;

class A{
	
	int a=10;
	
	public void m1(){
		System.out.println("abc");
	}
	
	public void m1(int a ){
		System.out.println("abc");
		this.a=a;
		System.out.println(  "this is method overloading " + a);
		
	}
}
class B extends A{
	public void m2 () {
		
		System.out.println("inheritance ");
		
		
	}
	
}
class jami extends B{
	
	public void m1(){
		super.m1();
		System.out.println("this is methos overriding  ");
		
		
	}
	
	public static void main (String args[]){
		jami t1= new jami ();
		t1.m1();
		t1.m2();
		
		
	}
}
