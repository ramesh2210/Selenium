package week1.day2;

import java.util.Arrays;

public class FindSecondLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 7, 9, 11, 15, 17, 5 };

		Arrays.sort(arr);
		System.out.println("Second Largest number is : " + arr[1]);
	}

}
