package learn.java8.features;

//class MyRunnable implements Runnable{
//
//	@Override
//	public void run() {
//		 for(int i=0 ; i <3 ; i ++) {
//			 System.out.println("child thread");
//		 }
//		
//	}
//	
//	
//}
public class MultiThreadLambda {

	public static void main(String[] args) {
		 
//		MyRunnable r = new MyRunnable();
//		Thread t = new Thread(r);
//		t.start();
		
		// Using Lambda
		Runnable r = ()->{
			for(int i=0; i<3 ; i++) {
				System.out.println("Chaid Thread using lambda");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i =0 ; i<3 ; i ++) {
			System.out.println("main thread");
		}

	}

}
