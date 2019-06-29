package Constructor;

public class B extends A {
	   
	public B(){
	        this(""); // calling one arg constructor of class B
	        System.out.println("B's no argument constructor");
	    }
	  
	public B(String args){
	        super(""); // calling one argument constructor of class A
	        System.out.println("B's one argument constructor");
	    }
	}
	 
