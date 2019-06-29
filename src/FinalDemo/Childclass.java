package FinalDemo;

public class Childclass extends FinalParentClassimheritingAvoid { // avoid inheritance
	
	public static void main(String[] args) {
		
		System.out.println("Child class");
	}
	
	public void add() { // avoids method overriding
		System.out.println("Addition");
	}

}
