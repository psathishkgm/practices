
package throw_keyword;

public class CharSplit {

public static void main(String[] args) {
		
		StringBuffer str1=new StringBuffer();
		StringBuffer str2=new StringBuffer();
		
 /*  String z= "SATHISH";
   String b="";
   int az = z.length();
   System.out.println(az);
   for( int i= z.length()-1; i>=0; i--)
   {
	   b= b + z.charAt(i);
   }
   System.out.println(b);*/
	
	String a = "This is selenium1234 testing";
	String b=a.replace(" ", "");//removing space replace.
	System.out.println(b);
	
	char c[]=a.toCharArray();//convert string into character
	
	for(Character Ch:c) {
		char cc=Character.toUpperCase(Ch);
		
		str2.append(cc);
		
		if(Character.isWhitespace(Ch) | Character.isDigit(Ch)){ //character class having isDigit ,isAlphabet,toupperchase  ... function
		
			str1.append(Ch);
		}
	}
	System.out.println(str1);
	System.out.println(str2);
	}
	
}
