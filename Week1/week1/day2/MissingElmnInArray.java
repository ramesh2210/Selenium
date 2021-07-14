package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElmnInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find the missing element in array input = {1,2,3,4,7,6,8};
		//calc1 = 1+2+3+4+7+6+8 EQUALS ? 
		//cal 2 = 1+2+3+4+5+7+6+8 EQUALS ?
		//Calc2-calc1 = result
		
	
		int [] inputArray = {1,2,3,4,7,6,8};
		Arrays.sort(inputArray);
		int len = inputArray.length;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < len; i++) {
			sum1 = sum1 + inputArray[i];
		}
		
		System.out.println("sum1:"+sum1);
		
		
		for (int j= 1; j <= 8; j++) {
			sum2 = sum2 + j;
		}
		
		System.out.println("sum2:"+sum2);
		System.out.println("Missing number is ::"+(sum2-sum1));
	}

	
}
