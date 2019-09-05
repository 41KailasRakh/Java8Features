package learn.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.SynchronousQueue;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 == o2) {
			return 0 ;
		}else if (o1 < o2 ){
			return -1 ;
		}else  
		return 0;
	}
	
}
public class CollectionLambda {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(20);
		a.add(25);
		a.add(15);
		a.add(0);
		a.add(10);
		a.add(5);
		System.out.println("Before sorting element");
		System.out.println(a);
		System.out.println("After sorting element using Collections.sort");
		Collections.sort(a, new MyComparator() );
		System.out.println(a);
		
		
		System.out.println("By Adding Lambda");
		Comparator<Integer> c = (Integer o1, Integer o2) -> {
			return   (o1 < o2) ?  -1 : (o1 > o2)? 1 : 0 ;
//			if(o1 == o2) {
//				return 0 ;
//			}else if (o1 < o2 ){
//				return 1 ;
//			}else  
//			return -1;
		};
		Collections.sort(a,c );
		System.out.println("result after lambda expression");
		System.out.println(a);
	}

}
