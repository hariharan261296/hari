package Home;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseCar {

	public static void main(String[] args) {
		Car car1=new Car(5,"hyundai",500000,320);
		Car car2=new Car(5,"audi",400000,350);
		Car car3=new Car(4,"ford",350000,400);
		ArrayList<Car>cars=new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		List<Integer>carSeat=cars.stream().map((a)->a.getNoOfSeats()).collect(Collectors.toList());
		carSeat.forEach(b->System.out.println(b));
		
		// TODO Auto-generated method stub

	}


	}

