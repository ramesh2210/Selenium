package week3.day1;

public class StringHandling {

	public static void main(String[] args) {
		// Index for character E and s 

		
		
		          String text = "Java Exercise" ;
		          
		          System.out.println("Index value of char E is" +text.indexOf("E")+"and Index value of char s is" +text.indexOf("s"));
		         

		          
		          //**  Explore with == operator
      			//**               equals
      			 //          equalsignorecase  
		          
		          String str1="I am Learning Java"; 
		          String str2="I am learning java";   
		          
		          System.out.println("Using Operator == result is "+str1==str2);
		          System.out.println("Using equals result is "+str1.equals(str2));		
		          System.out.println("Using Operator equalsIgnoreCase result is "+str1.equalsIgnoreCase(str2));
		          
		          
		          // replace a specified character with another character and add # to the given string.
		          //I am working with Java8
//		          replace 8 to 11 
//		          Print the characters from 5 to 14
		          
		          String sentence = "Java8";
		          System.out.println("index is "+sentence.indexOf('8'));
		          String result = sentence.replaceAll("\\d", "11");
		          System.out.println("Result after replacing 8 to 11 is "+result);
	}

}
