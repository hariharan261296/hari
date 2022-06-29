package Hashmapexe;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomer {

	public static void main(String[] args) {
		Customer c1=new Customer("Sham","sham@gmail.com",6546411316464l,"AZIPH2012B","male",24);
		Customer c2=new Customer("Yugi", "Yudi@gmail.com",656557789899l,"AZIPHG4675B","male",24);
		Customer c3=new Customer("Shinta", "Shinta@gamil.com",5365765758l,"STDFFYH86B","female",24);
		Customer c4=new Customer("mervin", "mevin@gmai.com", 88646664646l,"GFGFJGJ65BG","male",28);
		Customer c5=new Customer("kavin", "kavin@gmail.com",65556568999l,"DDSTGG56HG","male",24);
		Customer c6=new Customer("jefrin","jefrin@gmail.com",465484964664l,"DGDFDSGHS65","female",27);
		
		HashMap<Long,Customer>details=new HashMap<>();
		
		// TODO Auto-generated method stub
		details.put(c1.getAccNumber(), c1);
		details.put(c2.getAccNumber(), c2);
		details.put(c3.getAccNumber(), c3);
		details.put(c4.getAccNumber(), c4);
		details.put(c4.getAccNumber(), c4);
		details.put(c5.getAccNumber(), c5);
		details.put(c6.getAccNumber(), c6);
		
	//	for(Long i:details.keySet()) {
			
		
	
		//System.out.println(i);
	//	details.forEach((y,z)->System.out.println(y+", "+z));
	//	Iterator<Long>itr=details.keySet().iterator();
		//while(itr.hasNext()) {
			//System.out.println(itr.next());
		
		
		//for(Long i:details.keySet()) {
			//if(i==465484964664l) {
				//System.out.println(details.get(i));
			
		//	for(Customer i:details.values()) {
			//	if(i.getGender().equals("female")) {
				//	System.out.println(i);
		
		
//				int max=0;
//				String s="";
//		for(Customer customer:details.values()) {
//			if(customer.getAge()>max) {
//				max=customer.getAge();
//				s=customer.getName();
//			}
//		}
//		System.out.println(s);	
		
		Iterator<Long>itr=details.keySet().iterator();
		while(itr.hasNext()) {
			if(details.get(itr.next()).getGender().equals("male")) {
				itr.remove();
			}
		}
		details.forEach((x,y)->System.out.println(x+", "+y));
	}
}
			


	


