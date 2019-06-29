package throw_keyword;

public class Stringmanipulation {

	public static void main(String[] args) {
		
		String s = "The rain started here successfully";
		String s1 = "The rain started here1 successfully";
		String s2 = "             Hello World          ";
		String s3 = "Hello_world_test_selenium";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('s'));
		System.out.println(s.indexOf('s', s.indexOf('s')+1));
		System.out.println(s.indexOf("here"));
		System.out.println(s.indexOf("fail")); //if -1 means index is not present in the string but no exception or error.
		//String comparison
		if(s.equals(s1))
		{
		System.out.println("true");	
		}
		else {
			System.out.println("false");
		}
		//Sub string
		System.out.println(s.substring(0, 9));// it omits char at 9th position
		//trim
		System.out.println(s2.trim());
		//split the string
		String s4[] = s3.split("_");
		for(int i=0; i<s4.length;i++)
		{
			System.out.println(s4[i]);
		}
        String s5 = "corres";
        System.out.println(s5.concat("s"));
        //concat
        String s6 = "hello";
        String s7 = "world";
        int a = 100;
        int b = 200;
        System.out.println(s6+s7+a+b);
	}

}
