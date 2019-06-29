package throw_keyword;

public class Pattern 
{
    public static void main(String[] args) 
	{
			/*int arr[]= {1,2,3,4,5};
			for(int i:arr) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}	*/
    	String s = "My name is Sathish1234 !@#$";
    	String r = s.replace(" ", "");
    	System.out.println(r);
    	
    	char c[]= s.toCharArray();
    	
    	StringBuffer a = new StringBuffer();
    	StringBuffer b = new StringBuffer();
    	StringBuffer d = new StringBuffer();
    	
    	for (Character cha:c)
    	{
    		char ch=Character.toUpperCase(cha);
    		
    		a.append(ch);
    		
    		if (Character.isDigit(cha))
    		{
    		b.append(cha);	
    		}
    		if (Character.isWhitespace(cha))
    		{
    			d.append(r);
    		}
    	}
    	System.out.println(b);
    	System.out.println(a);
    	System.out.println(d);
		} 
}
