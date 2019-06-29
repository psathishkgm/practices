package throw_keyword;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num, temp , rem , rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
	    num = sc.nextInt();
	    
	    temp = num;
	    
	    while(num!=0)
	    {
	    	rem = num % 10;
	    	rev = rev*10 + rem;
	    	num = num/10;
	    }
	    System.out.println(temp);
	    if(temp==rev)
	    {
	    	System.out.println("Palindrome");
	    }
	    else
	    {
	    	System.out.println("not a palindrome");
	    }
	    

	}

}
