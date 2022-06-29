package Home;

import java.util.ArrayList;

public class UseDoor {

	public static void main(String[] args) {
		Door door1=new Door("brown",1500,false);
		Door door2=new Door("white",2000,true);
		Door door3=new Door("black",500,true);
		ArrayList<Door>doors=new ArrayList<>();
		doors.add(door1);
		doors.add(door2);
		doors.add(door3);
		long doorNum=doors.stream().filter((a)->a.getPrice()<=1500).count();
		System.out.println(doorNum);
		
		// TODO Auto-generated method stub

	}

}
