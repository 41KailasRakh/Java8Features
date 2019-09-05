package learn.java8.features;

interface Interf{
	
	public int squareIt(int i);
}
//class Demo implements Interf{
//
//	 
////	public int squareIt(int i) {
////		return i*i ;
////		
////	}	
//	// Equivalent Lambda Expression
//	
//	 
//	
//}
public class LambdaExpresstion {

	public static void main(String[] args) {
	
		Interf f = i->i*i ;
		System.out.println("Squar: "+f.squareIt(4));

	}

}
