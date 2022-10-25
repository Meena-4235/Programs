import java.util.Scanner;
public class MergeSort{
public static void main(String[] args) {
int i,n;
int[] a=new int[100];
Merge m=new Merge();
System.out.println("enter total number of elements:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("enter the elements:");
for(i=0;i<n;i++)
 a[i]=sc.nextInt();
 System.out.println("before sorting:");
 for(i=0;i<n;i++)
 System.out.println(a[i]);
 m.mergepass(a,0,n-1);
 System.out.println("after sorting:");
 for(i=0;i<n;i++)
 System.out.println(a[i]);
}
}