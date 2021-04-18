public class StringExample{
	public static void main (String args[]){
		
		// Declare Stringusing letrels 
		
		String str= "Gazala";
		String str1="Gazala";
		
		// compare String litrels  we can compare string letrels with .equals(); method or "==" opretor it compare hash value in str and str1 and comare the content 
		
		if(str==str1){
			System.out.println("str is equal to str2");
		}
		else{
			System.out.println("str is not equal to str2 ");
			
		}
		 
		if(str.equals(str1)){
			System.out.println("Str.equalTo Str1");
			
		}else{
			System.out.println("str.equalTo not str1");
		}
		// create string using new keyword 
		 System.out.println("*********************************");
		  
		String str2= new String ("Sam");
		String str3= new String ("Sam");
		if(str2==str3){
			System.out.println("str2 is equal to str3");
		}
		else{
			System.out.println("str2 is not equal to str3 ");
			
		}
		  
		if(str2.equals(str3)){
			System.out.println("Str2.equalTo Str3");
			
		}else{
			System.out.println("str2.equalTo not str3");
		}
		
		// compareTo Method 
		 System.out.println("*********************************");
		  if(str2.compareTo(str3)==0){
			  System.out.println("str2 is compared str3 ");
			  
		  }
		  else{
			  System.out.println("str2 is not compared str3");
		  }
		
		// find  length of string an all 
		 System.out.println("*********************************");
		  
		String str4= "Hello ,  Gazala  , Malik  , Is  , with , Me ";
		int len= str4.length();
		System.out.println("length of the str4 " + len);
		// find the character at the bases of index value in the string 
		 System.out.println(str4.charAt(0) + " , "  + str4.charAt(len-1));
		 System.out.println("Str4 is " + str4);
		 
		  // to uppercase convert 
		 System.out.println("String is in upper case " + str4.toUpperCase());
		 
		 // this sub string is contains by the string or not 
		 if(str4.contains("Malik")){
			 System.out.println("to find the sub part of string whather this is the part off the string or not " );
			 
		 }else{
			 System.out.println("not the partof the string ");
			 
		 }
		 // find substring in the string 
		  System.out.println("*********************************");
		 String s2= str4.substring(6);
		 System.out.println("subString is after index 6 is " + s2);
		 
		 String s3 = str4.substring(6,19);
		 System.out.println(" S3 is the updated string which is start from 6 index and end with 19 index " + s3);
		 // we can replace only cahracter not a sub string 
		 String s4= str4.replace('G', 'M');
		 System.out.println("replace method is called "  + s4);
		 
		 // now most important convert a string into char 
		  System.out.println("*********************************");
		  
		 char [] c= str4.toCharArray();
		 for(char ch : c){
			 System.out.print(ch + " " );
			 
		 }
		 
		 // use of split method 
		  System.out.println ("*********************************");
		  
		 String a[]= str4.split(",");
		 for(String st: a){
			 System.out.println(st.trim());
		 }
		 
		 
		 String string = new String ("hello");
		 string.concat("World");
		 System.out.println("string is " + string);
		 
		// System.out.println(sm );
		  StringBuffer stb= new StringBuffer("Hello");  // stringBuffer is syncronised meand thread safe 
		  stb.append(" mWout");
		  System.out.println(stb);
		  
		  
		  // use of string builder
            StringBuilder stbuilder= new StringBuilder("Hello");  // stringBuffer is  not syncronised meand it is not thread safe 
		  stbuilder.append(" mWout");
		  System.out.println(stbuilder);		  
	}
}