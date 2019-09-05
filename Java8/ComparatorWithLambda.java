package learn.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorWithLambda {

	public static void main(String[] args) {
		
ArrayList<Developer> developers = new ArrayList<Developer>();
		
		Developer dev1 = new Developer() ;
		dev1.setProgramming("Java");
		dev1.setVersion(8);
		dev1.setRate(6);
		
		Developer dev2 = new Developer() ;
		dev2.setProgramming("Ruby & Rails");
		dev2.setVersion(15);
		dev2.setRate(4);
		
		Developer dev3 = new Developer() ;
		dev3.setProgramming("R");
		dev3.setVersion(14);
		dev3.setRate(4);
		
		Developer dev4 = new Developer() ;
		dev4.setProgramming("JavaScript");
		dev4.setVersion(9);
		dev4.setRate(7);
		
		Developer dev5 = new Developer() ;
		dev5.setProgramming("C#");
		dev5.setVersion(10);
		dev5.setRate(5);
		
		Developer dev6 = new Developer() ;
		dev6.setProgramming("Scala");
		dev6.setVersion(9);
		dev6.setRate(3);
		
		Developer dev7 = new Developer() ;
		dev7.setProgramming("LISP");
		dev7.setVersion(7);
		dev7.setRate(1);
		
		Developer dev8 = new Developer() ;
		dev8.setProgramming("Python");
		dev8.setVersion(9);
		dev8.setRate(2);
		

		developers.add(dev1);
		developers.add(dev2);
		developers.add(dev3);
		developers.add(dev4);
		developers.add(dev5);
		developers.add(dev6);
		developers.add(dev7);
		developers.add(dev8);
		System.out.println("Before sorting");
		
		
		Comparator<Developer> comparator = (Developer d1,Developer d2)->{
			return 1 ;
		} ;
		Collections.sort(developers, comparator);
		for(Developer d : developers) {
			System.out.print("Prgramming language is, "+d.getProgramming());
			System.out.print(" Current Version, " +d.getVersion());
			System.out.print(" Rating myself to, "+d.getRate());
			System.out.println();
		}
		
		Comparator<Developer> comparator2 = (Developer d1,Developer d2)->{
			return -1 ;
		} ;
		developers.sort(comparator2);
		 
		for(Developer d : developers) {
			System.out.print("Prgramming language is, "+d.getProgramming());
			System.out.print(" Current Version, " +d.getVersion());
			System.out.print(" Rating myself to, "+d.getRate());
			System.out.println();
		}

	}

}
