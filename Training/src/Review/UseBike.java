package Review;

import java.util.ArrayList;
import java.util.HashMap;

public class UseBike {

	public static void main(String[] args) {
		Bike b1=new Bike("Duke",250000,"Tno7 5532");
		Bike b2=new Bike("Royal Enfield",350000,"Tno5 3253");
		Bike b3=new Bike("Yamaha",450000,"Tno6 5582");
		
		ArrayList<Bike>bikes=new ArrayList<>();
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);
		
		HashMap<String,Bike>bikes1=new HashMap<>();
		
		for(Bike k: bikes ) {
			bikes1.put(k.getVehicleNumber(), k);
		}
		
//		for(Bike z: bikes1.values()) {
//			System.out.println(z);
//		}
		
		for(String v: bikes1.keySet()) {
			System.out.println(v);
		}
		// TODO Auto-generated method stub

	}

}
