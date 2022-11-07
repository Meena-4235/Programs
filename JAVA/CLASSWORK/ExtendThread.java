class NewThread extends Thread{
	NewThread(){
		super("DemoThread");
		System.out.println("child Thread:"+this);
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread is:"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
		 	System.out.println("child interrupted");
		}
		System.out.println("Exting Child Thread");
	}
}
class ExtendThread{
	public static void main(String args[]){
		NewThread nt=new NewThread();
		nt.start();
		try{
			for(int i=10;i>0;i--){
				System.out.println("Main Thread is:"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
		 	System.out.println("Main interrupted");
		}
		System.out.println("Exting Main Thread");
	}
}