import java.util.Random;
import java.lang.Thread;
class Thread1 extends Thread{
	public void run(){
		Random r=new Random(); // random class object creating new refernce to the class
		int i=r.nextInt(100); //random numbers taken upto 100
		System.out.println("number generated+"+i);
		if (i%2==0){
			// object creation for 2nd thread2 
			Thread2 ob2=new Thread2(i); //if the num is even,second threads computes the square of the numbers and prints 
			ob2.start(); // it will calls the run method of 2nd thread and access it
		}
		else {
			Thread3 ob3=new Thread3(i);
			ob3.start();
		}
	}
class Thread2 extends Thread{ // second thread
	int j;
	Thread2(int i){
		j=i;
	}

	public void run(){
			System.out.println("square of the number:"+(j*j));
		}
	}
}
class Thread3 extends Thread{ //thrid thread
	int k;
	Thread3(int i){
		k=i;
	}
	public void run(){
			System.out.println("cube of the number is:"+(k*k*k));
		}
	}

class ThreadDemo extends Thread{ //main method creation
	public static void main(String args[]){
		Thread1 ob1=new Thread1(); // object creation for class Theard1
		ob1.start(); // access the run method 
	} 
}
