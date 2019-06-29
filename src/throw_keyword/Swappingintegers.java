package throw_keyword;

public class Swappingintegers {

	public static void main(String[] args) {
	
		// 1. using temp variable
		int a= 5;
		int b= 10;
		//int t;
		//t=a;
		//a=b;
		//b=t;
		//System.out.println(a);
		//System.out.println(b);

		// 2. without using temp variable
		
		a = a+b; //15
		b = a-b; //5
		a = a-b; //10
		
		System.out.println(a);
		System.out.println(b);
	}

}
