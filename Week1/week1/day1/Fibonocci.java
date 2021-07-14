package week1.day1;

public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int x = 0;
		int y = 1;
		int sum = 0;
		int z;
		int range = 10;
		
		System.out.println(+x);
		System.out.println(+y);
				
		 for (z = 0; sum <= range; z++) {
			
			sum = y + x;
			x = y;
			y = sum;
			
			System.out.println(+sum);
	}
	}

}
