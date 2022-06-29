package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
		Student s1=new Student("sham",456,"male",'A',80);
		Student s2=new Student("kavin",632,"male",'B',95);
		Student s3=new Student("mohan",789,"male",'C',55);
		Student s4=new Student("shinta",722,"female",'A',56);
		Student s5=new Student("jefrin",258,"female",'B',89);
		Student s6=new Student("hari",451,"male",'C',65);
		Student s7=new Student("priya",125,"female",'A',75);
		Student s8=new Student("janani",822,"female",'B',35);
		Student s9=new Student("Nandini",450,"female",'C',25);
		ArrayList<Student>students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		//List<Student>highMarkList=students.stream().filter((x->x.getMark()>80)).collect(Collectors.toList());
		//highMarkList.forEach(y->System.out.println(y));
		
		List<Student>sectionAStudent=students.stream().filter((sec)->sec.getSection()=='A').collect(Collectors.toList());
		List<Student>sectionBStudent=students.stream().filter((sec)->sec.getSection()=='B').collect(Collectors.toList());
		List<Student>sectionCStudent=students.stream().filter((sec)->sec.getSection()=='C').collect(Collectors.toList());
		sectionAStudent.forEach(x->System.out.println(x));
		sectionBStudent.forEach(y->System.out.println(y));
		sectionCStudent.forEach(z->System.out.println(z));
		// TODO Auto-generated method stub

	}

}
