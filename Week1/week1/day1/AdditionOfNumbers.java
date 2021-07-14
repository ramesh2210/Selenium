package week1.day1;

public class AdditionOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 127;
		int remainder;
		int quotient = 0;
		double sum = 0;
		
		
		while(number > 0)
		{
			remainder = number % 10;
		//	System.out.println("Remainder is"+ remainder);
			quotient = number/10;
			
		//	System.out.println("quotient is"+ quotient);
			sum = sum + remainder;
			
			number = quotient ;
			
		}
		System.out.println("sum"+ sum);
	}

}

