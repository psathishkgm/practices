package throw_keyword;

public class Duplicate {

	public static void main(String[] args) {
		
		String a[]= {"Java","C","Python","Ruby","Javascript","Java","Ruby"};
		System.out.println(a.length);
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j]))
				{
					System.out.println("Duplicate is:"+a[i]);
				}
			}
		}

	}

}
