package Review;

public class Findnoinstring {

	public static void main(String[] args) {
		String a="hello1234";
		char[]b=a.toCharArray();
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(b[i]>='1' &&  b[i]<='9') {
			count=count+1;	
				
			}
			
		}
		System.out.println(count);
	}

}
