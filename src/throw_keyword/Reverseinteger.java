package throw_keyword;

public class Reverseinteger {

	public static void main(String[] args) {
		
		int n=374893;
		int rev_int=0;
		
		while(n!=0)
		{
		rev_int= rev_int * 10 + n % 10;
		n= n/10;
		}
       System.out.println("The reverse is:" +rev_int);
	}

}
