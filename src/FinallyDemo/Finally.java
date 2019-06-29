package FinallyDemo;

public class Finally {
	
	public static void main(String[] args) {
	div();	
	}

	public static void div() {
		
		try {
			System.out.println("In try block");
			//throw new ArithmeticException("divide");*/
			int a=10;
			System.out.println(a/0);
			} catch(Exception e) {
				System.out.println(e.getStackTrace());
			} finally { // sometimes driver.quit() also mention inside finally block
			System.out.println("Will execute whether the exception is there or not");
		} 
	}
}
// Finalized is used for garbage collection