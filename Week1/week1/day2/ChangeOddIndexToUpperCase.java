package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Declare String Input as Follow
		  
		 String test = "changeme";
		 
		// Convert the String to character array
		 
		 char [] test1 = test.toCharArray();
		 int len = test1.length;
		 String temp ="";
		 
		 // b) Traverse through each character (using loop)
		 
		 for (int i = 0; i < test1.length; i++) {
			
			 //c)find the odd index within the loop (use mod operator) 
			 // d)within the loop, change the character to uppercase, if the index is odd else don't change
			if (i%2 == 1) {
				
				char ch = test1[i];	
				char ch1 = Character.toUpperCase(ch);
				temp = temp + ch1;
				//System.out.println(Character.toUpperCase(ch1));
				
			} else {
				char ch2 = test1[i];
				temp = temp + ch2;
			}
			}
		 System.out.println("STRING IS: "+temp);
		
		  
		 }}


