package design_pattern;

public class Singleton {

	private static Singleton FirstInstance = null;
	static boolean myThread = true;

	private Singleton() {

	}

	// synchronized : Force every thread to wait for its chance
	public static synchronized Singleton getInstance() {
		if (FirstInstance == null) {

			if (myThread) {
				myThread = false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			/*
			 * Alternate way is to remove synchronized from the method level
			 * because it slows down
			 * 
			 

			synchronized (Singleton.class) {
				if (FirstInstance == null) {
					FirstInstance = new Singleton();
				}

			}
			*/
		}
		return FirstInstance;
	}

}
