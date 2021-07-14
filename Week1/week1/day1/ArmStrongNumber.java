package week1.day1;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 163;
		int number = input;
		int sum = 0;
		int xValue;
		int yValue;
		
		while (number > 0) {
			
			xValue = number%10;
			yValue = number/10;
			int calc = xValue * xValue * xValue;
		//	System.out.println("total is "+calc);
			sum = sum + calc;
			System.out.println("sum is "+sum);
			number = yValue;
				
			
		}	
		
		if (input == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not an armstrong");
		}
	}

}
