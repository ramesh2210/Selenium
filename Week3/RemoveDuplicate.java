package week3.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

//		Declare a String as PayPal India
//
//		1.Convert it into a character array
//
//		2.Declare a Set as charSet for Character
//
//		3.Declare a Set as dupCharSet for duplicate Character
//
//		4.Iterate character array and add it into charSet
//		Note: add() method in a set returns boolean value. 
//		      Duplicate values will not be added and hence will return "false"
//		      So, we can find out if an element is added to the set or not using IF condition. 
//
//		5. If the element is not added in the step 4,
//		   it means the character is a duplicate and the character is already in the charSet
//		   Then, add it to the dupCharSet
//
//		6.Check the dupCharSet elements and remove those in the charSet
//		  Note: use removeAll()
//
//		7.Iterate using charSet
//
//		8.Check the iterator variable isn't equals to an empty space
//
//		9.print it

		String name = "PayPal India";
		char[] ch = name.toCharArray();
		int len = ch.length;
		System.out.println("Length of the Char Array " + len);
		
		Set <Character> dupCharSet = new LinkedHashSet<Character>();
		Set <Character> charSet = new LinkedHashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			
			Boolean result = charSet.add(ch[i]);
			
			if (result == false)
			
			{
				dupCharSet.add(ch[i]);
			}
		}
		
		System.out.println("Result of Set charSet "+charSet);
		System.out.println("Result of Duplicate charSet "+dupCharSet);
		
		charSet.removeAll(dupCharSet);
		
		System.out.println("CharSet after removing elements from dupCharSet" +charSet);
		
		for(int i = 0; i < charSet.size();i++) 
		{
			//char c = ' ';
			charSet.remove(' ');
			
			} System.out.println(charSet);
		}
			

		
		   
	}
		
		
		
			
		
		
		
		

		
		



