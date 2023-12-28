//Take an array of names as input from the user and print them on the screen.
import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of names you want to enter: ");
		int length=sc.nextInt();
		String a[]=new String[length];
		for (int i=0;i<a.length;i++){
			System.out.print("enter "+i+" th name: ");
			a[i]=sc.next();
		}
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}