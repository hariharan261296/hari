package OOps;

public class Occur {
	public static void main(String[] args) {
		String a="character";
		int count=0;
		char search='h';
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==search) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
