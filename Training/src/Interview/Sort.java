package Interview;

import java.util.ArrayList;

public class Sort {

	public static void main(String[] args) {
		int[] num= {20,30,40,50};
		ArrayList<Integer>nums=new ArrayList<>();
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>20) {
				nums.add(num[i]);
			}
		}
		nums.Stream.Sorted();
		System.out.println(nums);

	}

}
 