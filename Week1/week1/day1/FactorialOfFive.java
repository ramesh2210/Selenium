package week1.day1;

public class FactorialOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5*4*3*2*1

		int fact = 5;
		int temp1 = 1;
		for (int i = fact; i > 0; i--) {
			
			 temp1 = temp1 * i;
			
			
		} 
		
		 System.out.println("Number is " +temp1);
	}

}
