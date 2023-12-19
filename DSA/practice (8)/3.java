import java.util.*;
//Write a function which takes in 2 numbers and returns the greater of those two.
class max{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int a=sc.nextInt();
		System.out.println("enter second number: ");
		int b=sc.nextInt();
		System.out.println("max is: "+max(a,b));
	}
	public static int max(int n1,int n2){
		if(n1>n2){
			return n1;
		}else{
			return n2;
		}
	}
}
