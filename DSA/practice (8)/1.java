//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
class avg{
	static int n1,n2,n3;
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.print("enter 1st no.: ");
		n1=sc.nextInt();
		System.out.print("enter 2nd no.: ");
		n2=sc.nextInt();
		System.out.print("enter 3rd no.: ");
		n3=sc.nextInt();
		//for 1
		nrna();
		//for 2
		nrwa(n1,n2,n3);
		//for 3
		System.out.println("average by 3 is: "+wrna());
		//for 4
		System.out.println("average by 4 is: "+wrwa(n1,n2,n3));
	}
	//1. no return no argument.
	public static void nrna(){
		System.out.println("average by 1 is: "+((n1+n2+n3)/3));
	}
	//no return with argument.
	public static void nrwa( int a,int b,int c){
		System.out.println("average by 2 is: "+((a+b+c)/3));
	}
	//with return no argument.
	public static int wrna(){
		int s1= ((n1+n2+n3)/3);
	return s1;
	}
	//with return with argument.
	public static int wrwa(int a,int b,int c){
		int s2=((a+b+c)/3);
		return s2;
	}
}