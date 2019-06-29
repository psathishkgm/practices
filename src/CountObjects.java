
public class CountObjects {
	
	static int countObjects = 0;

	    public CountObjects(int a) //constructor overloading (It overload the constructor values too)
	    { 
	    	countObjects = countObjects + 1; //output 3
	    } 
	    
	    public CountObjects(int a,int b) {
			
	    	countObjects = countObjects + 2; //output 6
		}
	    
        public CountObjects() {// this will call if constructor is overloaded too
			
	    	countObjects = countObjects + 4; //output 12
		}
	    public static void main(String name) {//main method overloading
	    	
	    }
	    
	    public static void main(String args[]) //jvm will search for default this one while main method overloading too
	    { 
	    	CountObjects t1 = new CountObjects(); 
	    	CountObjects t2 = new CountObjects(); 
	    	CountObjects t3 = new CountObjects(); 
	  
	       System.out.println(CountObjects. countObjects); 
	    } 
	    
	    public static void main(int a) {
	    	
	    }
	}
