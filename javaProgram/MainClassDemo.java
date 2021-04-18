class Parent {
	public Object home(){
		return null;
	}
}

class Child extends Parent {
	public String  home(){
		return null;
	}
	
	
}

class mainClassDemo{
	public static void min(String args[]){
	Parent p= new Parent();
	p.home();
	
	System.out.println("***********");
	
	Child  c=new Child();
	c.home();
	}
	
}