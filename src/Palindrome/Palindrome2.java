package Palindrome;

public class Palindrome2 {
	 
	public static void main(String args[])  
	{  
	 isPalindrome(453);   
	}
	
	public static void isPalindrome(int num) {
		
		int rev = 0;
		int sum = 0;
		int t;
		 
		t = num;
		
		while (num>0) {
			
			rev = num % 10;
			num= num/10;
			sum = (sum*10)+rev;
		}
		
		if(t==sum) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not a palindrome");
		}
	}
}

