package Hashmapexe;

import java.util.HashMap;

public class UseAadharCard {

	public static void main(String[] args) {
		AadharCard a1=new AadharCard("sham",23,555644446666l,"male","deva");
		AadharCard a2=new AadharCard("Yugi",24,787745444654l,"male","bala");
		AadharCard a3=new AadharCard("kavin",27,596565656566l,"male","vinayaka");
		AadharCard a4=new AadharCard("bharath",35,54646464644l,"male","siddu");
		AadharCard a5=new AadharCard("vinoth",45,4546464646465l,"male","nirmal");
		AadharCard a6=new AadharCard("priya",32,76464646476422l,"female","anandan");
		AadharCard a7=new AadharCard("janani",55,78956464649164l,"female","vanchinathan");
		AadharCard a8=new AadharCard("nandini",74,2114445222224l,"female","nagamani");
		AadharCard a9=new AadharCard("abishega",18,7894464646464l,"female","prabhu");
		AadharCard a10=new AadharCard("mohana",36,5565565656665l,"female","ramachandran");
		
		HashMap<Long,AadharCard>details=new HashMap<>();
		
		details.put(a1.getAadharNumber(), a1);
		details.put(a2.getAadharNumber(), a2 );
		details.put(a3.getAadharNumber(), a3);
		details.put(a4.getAadharNumber(), a4);
		details.put(a5.getAadharNumber(), a5);
		details.put(a6.getAadharNumber(), a6);
		details.put(a7.getAadharNumber(), a7);
		details.put(a8.getAadharNumber(), a8);
		details.put(a9.getAadharNumber(), a9);
		details.put(a1.getAadharNumber(), a10);
		
		
	//	for(AadharCard i: details.values()) {
		//	if(i.getAge()>45) {
		
			//System.out.println(i);
		//	}	
			
	//	}
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
