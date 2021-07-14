package week1.day2;

import java.util.Iterator;

public class DuplicateStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		String splitText [] = text.split(" ");
       
        
        for (int i = 0; i < splitText.length; i++) {
        	        	      
        	for (int j = i+1; j < splitText.length; j++) {
        		
        		if(splitText[i].equals(splitText[j]))
         		
        		{
            		System.out.println("Duplicate String is :" +splitText[i]);
        		
        		}
	}
        		
        	
			}
		}	
	

}
