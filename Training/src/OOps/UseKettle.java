package OOps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseKettle {

	public static void main(String[] args) {
		
		Kettle k1=new Kettle("pigeon",499,1.5f);
		Kettle k2=new Kettle("prestige",299,1.5f);
		Kettle k3=new Kettle("philips",1200,1.7f);
		ArrayList<Kettle>kettles=new ArrayList<>();
		kettles.add(k1);
		kettles.add(k2);
		kettles.add(k3);
		float s=0;
		List<Float>findValue=kettles.stream().map((x)->x.getCapacity()).collect(Collectors.toList());
		s=s+0;
	}
          findValue.forEach(s->System.out.println(s));
		// TODO Auto-generated method stub

	

}
