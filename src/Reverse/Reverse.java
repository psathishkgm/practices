package Reverse;

public class Reverse {

	   public static void main(String args[])
	   {
	      int num=123, reverse = 0;
	         
	      while(num != 0)
	      {
	          reverse = reverse * 10;
	          reverse = reverse + num%10;
	          num = num/10;
	      }
	       
	      System.out.println("Reverse of the number is " + reverse);
	   }
	}
