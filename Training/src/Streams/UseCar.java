package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCar {

	public static void main(String[] args) {
		Car c1=new Car("hyundai",1200000,"blue","creta");
		Car c2=new Car("honda",1500000,"grey","hondacity");
		Car c3=new Car("maruthi",700000,"red","k10");
		Car c4=new Car("tata",4000000,"red","brezza");
		Car c5=new Car("Bmw",8000000,"red","q10");
		Car c6=new Car("rolls Royce",12000000,"black","ghost");
		Car c7=new Car("ferrai",70000000,"black","fast");
		Car c8=new Car("nissan",4510000,"blue","baleno");
		Car c9=new Car("tesla",78000000,"grey","phantom");
		Car c10=new Car("Audi",12000000,"blue","650d");
		ArrayList<Car>cars=new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);
		cars.add(c7);
		cars.add(c8);
		cars.add(c9);
		cars.add(c10);
		
		//long carsCount=cars.stream().filter((x)->x.getColour().equals("red")).count();
		//System.out.println(carsCount);
		
		List<Car>highPrice=cars.stream().filter((x)->x.getPrice()>3000000).collect(Collectors.toList());
		long highPriceCount=cars.stream().filter((y)->y.getPrice()>3000000).count();
		System.out.println(highPriceCount);
		// TODO Auto-generated method stub

	}

}
