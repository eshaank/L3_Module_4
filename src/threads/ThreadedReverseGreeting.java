package threads;
public class ThreadedReverseGreeting {
  static //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	public  void main(String[] args) {
		Thread[] thread = new Thread[50];
		
		thread[0] = new Thread(new  Runnable() {
			public void run() {
				for (int i = 1; i < 51; i++) {
				
					
					
					
				thread[i] = new Thread(new Runnable() {
						
						@Override
						public void run() {
						
							
						}
					});
					thread[i].start();
					
				}
				
			}
		});
		thread[0].start();
	}
}
