package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop l1=new Laptop("lenovo","penitium",50000,"4gb",true);
		Laptop l2=new Laptop("hp","i5",70000,"8gb",true);
		Laptop l3=new Laptop("lenovo","i6",45000,"8gb",true);
		Laptop l4=new Laptop("lenovo","i3",86000,"8gb",true);
		Laptop l5=new Laptop("acer","penitium",100000,"4gb",false);
		Laptop l6=new Laptop("hp","i10",76000,"4gb",false);
		ArrayList<Laptop>laptops=new ArrayList<>();
		
		laptops.add(l1);
		laptops.add(l2);
		laptops.add(l3);
		laptops.add(l4);
		laptops.add(l5);
		laptops.add(l6);
		
		//List<Laptop>ssdLaptops=laptops.stream().filter((x)->x.isSsd() == true).collect(Collectors.toList());
	//	ssdLaptops.forEach((y)->System.out.println(y));
		
		List<Laptop>ramLaptops=laptops.stream().filter((x)->x.
		// TODO Auto-generated method stub

	}

}
