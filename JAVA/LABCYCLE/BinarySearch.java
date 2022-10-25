import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int b[]=new int[10];
	int i,j,key,n;
	System.out.println("enter total number of elements:");
	n=sc.nextInt();
	System.out.println("enter the elements:");
	for(i=0;i<n;i++) 
		b[i]=sc.nextInt();
	System.out.println("enter your searching element:");
	key=sc.nextInt();
	Binary c=new Binary(b,n,key);
	c.binary();
	}
}