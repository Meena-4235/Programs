class CurrentThreadDemo{
	 public static void main(String args[]){
	 	Thread t=Thread.currentThread(); // Returns a reference to the currently executing thread object
	 	System.out.println("CurrentThread:"+t);
	 	// change name of the thread
	 	t.setName("NewThread");
	 	System.out.println("After name changing:"+t);
	 	try{
		 	for(int i=5;i>0;i--){
			 	System.out.println(i);
			 	Thread.sleep(1000);
		 	}
	 	}
	 	catch(InterruptedException e){
		 	System.out.println("Main Thread Execution");
		}
     	}
}