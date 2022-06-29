package Hashmapexe;

import java.util.HashMap;
import java.util.Iterator;

public class Bike {

	public static void main(String[] args) {
		HashMap<String,String>chasisDetails=new HashMap<>();
		chasisDetails.put("1224FCGVV", "YAMAHA");
		chasisDetails.put("765587JIHH", "HONDA");
		chasisDetails.put("867575GFYDA", "ROYAL ENFIELD");
		chasisDetails.put("566313DGDJ", "BMW");
		//for(String i: chasisDetails.keySet()) {
		//System.out.println(i);
		
		//for(String cha: chasisDetails.values()) {
			//System.out.println(cha);
		// TODO Auto-generated method stub
		
		//chasisDetails.forEach((k,v)-> System.out.println(k+","+ v));
		
		Iterator<String>itr=chasisDetails.keySet().iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}

	}

}

