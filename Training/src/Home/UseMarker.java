package Home;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseMarker {

	public static void main(String[] args) {
		Marker marker1=new Marker("blue",35,false);
		Marker marker2=new Marker("red",30,false);
		Marker marker3=new Marker("black",35,true);
		ArrayList<Marker>markers=new ArrayList<>();
		markers.add(marker1);
		markers.add(marker2);
		markers.add(marker3);
		List<Character>permanent=markers.stream().map((a)->a.getColor().charAt(1)).collect(Collectors.toList());
		permanent.forEach(b->System.out.println(b));
		// TODO Auto-generated method stub

	}

}
