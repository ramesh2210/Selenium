package week1.day2;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputArr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int len = inputArr.length;
		System.out.println("Length of the array is :"+len);
		
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
				
				int temp = inputArr[i];
				int temp1 =  inputArr[j];
				
				if(temp == temp1 )	{
					
					System.out.println("Duplicate element is"+temp);
			
				}
			}
		}
		
	}

}
