package week3.day1;

public class StringCompare {

	public static void main(String[] args) {
		

		
		String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("*****");
		 
		 if(str3.equals(str4)) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("*****");
		 
		System.out.println(" == is an operator used for comparing Primitive data types.equals() is the operator used "
				+ "for Non-primitive data type STRING. where equals() comes from the String Class");
		
		 
	}

}
