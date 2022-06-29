package OOps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseMobile {

	public static void main(String[] args) {
		
		Mobile m1=new Mobile("blue",35000,false);
		Mobile m2=new Mobile("red",30000,false);
		Mobile m3=new Mobile("black",45000,true);
		ArrayList<Mobile>mobiles=new ArrayList<>();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		List<Integer>findVlue=mobiles.stream().filter((z)->z.getPrice()>33000).map((x)->x.getPrice()).collect(Collectors.toList());
		findVlue.forEach(y->System.out.println(y));
		// TODO Auto-generated method stub

	}

}
