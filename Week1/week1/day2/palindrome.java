package week1.day2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "MADAM";
		String revName = "";
		
		int len = name.length();
		System.out.println("lenght "+len);
		
		for (int i = len-1 ; i >= 0; i--) {
			
			revName = revName + name.charAt(i);
			
			
			//char revName = name.charAt(i);
			
						
		} 
		
		System.out.println("array is :" +revName);
		
	if (revName.equals(name))
	{
		System.out.println("Palindrome"); 
	}
	}

	

}
