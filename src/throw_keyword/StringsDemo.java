package throw_keyword;

public class StringsDemo {
	
	public static void main(String[] args) {
		
		String text = "java-selenium-qtp";
		String []toolname= text.split("-");
		
		for(int i=0; i<toolname.length; i++) {
			System.out.println("The position is: "+i +" " +toolname[i]);
			
			if(toolname[i].contains("java")) {
				
				System.out.println("passed");
				break;
			} else {
				System.out.println("Failed");
			}
			}
		}
	}
