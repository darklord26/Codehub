package concepts;

public class MultiThreading extends Thread{

	@Override
	public void run(){
		System.out.println("Welcome to multi-threading!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new MultiThreading();
		
		th.start();
		//th.run();
	}

}


