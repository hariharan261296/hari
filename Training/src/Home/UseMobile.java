package Home;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseMobile {

	public static void main(String[] args) {
		Mobile mobile1=new Mobile("samsung",15000,true);
		Mobile mobile2=new Mobile("oppo",16000,true);
		Mobile mobile3=new Mobile("applie",42000,false);
		
		ArrayList<Mobile>mobiles=new ArrayList<>();
		mobiles.add(mobile1);
		mobiles.add(mobile2);
		mobiles.add(mobile3);
		List<Mobile>highPrice=mobiles.stream().filter((mob)->mob.isAndroid()==true).collect(Collectors.toList());
		highPrice.forEach(b->System.out.println(b));
		// TODO Auto-generated method stub

	}

}
