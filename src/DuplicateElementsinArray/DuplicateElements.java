package DuplicateElementsinArray;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		String lang[] = {"Java","Javascript","C","Python","Java","C","c"};
		
		for(int i=0; i<=lang.length; i++) { // worst solution --> it compares each element 0(n*n)
		    for (int j=i+1; j<=lang.length-1; j++) {
		    	if(lang[i].equalsIgnoreCase(lang[j])) {
		    		System.out.println("Duplicate is: "+lang[i]);
		    		
		    	}
		    }
		}
		
		Set<String> la = new HashSet<String>();
		
		for(String cc:lang) {
			if(la.add(cc)!=true) {
				System.out.println("Duplicate value is::"+cc);
			}
		}
	}

}
