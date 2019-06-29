package throw_keyword;

public class Missingnumber {

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5,7,8,9,10};
		int b=0;
		int c=0;
		int i;
		int j;
		System.out.println(a.length);
		for(i=0; i<a.length; i++)
		{
		b= b + a[i];
		}
		for (j=1; j<=i+1; j++)
		{
		c= c + j;
		}
		
	  System.out.println("The missing num is:" +(c-b));
	}

}
