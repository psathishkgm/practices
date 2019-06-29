package MultipleInheritance;
public class MultipleInheritanceMain extends MultipleInheritanceC implements MultipleInheritanceInterface {
	
	        // Below code is **like** class A extends B, C 
			public static void main(String[] args) {
				
				MultipleInheritanceInterface child =  new MultipleInheritanceC();
				child.getValueC();
				   
			}

}
