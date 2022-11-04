class NewThread implements Runnable{
	Thread t;
	NewThread(){
		t=new Thread(this, "DemoThrad");
		System.out.println("child thread"+t);
	}
	public void run(){
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child Thread"+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Child Thread is Interrupted");
		}
		System.out.println("exting child thread");
	}
	
}
class ThreadMainDemo{
	public static void main(String args[]){
		NewThread nt=new NewThread();
		nt.t.start();
		try {
			for(int i=10;i>0;i--) {
				System.out.println("Main Thread"+i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			System.out.println("Main Thread is Interrupted");
		}
		System.out.println("exting main thread");
	}
}