package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortUsingColletion {

	public static void main(String[] args) {
		
		
//		Assignment 4: Sort using collection
//
//		1.Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)	
		
		List<String>cName = new ArrayList<String>();
		
		cName.add("Google");
		cName.add("Microsoft");
		cName.add("TestLeaf");
		cName.add("Maverick");
	

//		2. Get the length of the array		
        int len = cName.size();
        System.out.println("Lenght of char aaray "+len);
        
//		3. sort the array			
        Collections.sort(cName);
        System.out.println("Sorted Array is "+cName);
        
//		4. Iterate it in the reverse order
        
        List<String> rName = new ArrayList<String>();
        rName.addAll(cName);
        
        for (int i = len-1; i >= 0; i--) {
        	   String result = rName.get(i);
        	   System.out.println(result);
	
	} 
        
        } }

	


