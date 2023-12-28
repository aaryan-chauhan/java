//Write a Java program to find product of all digits of an integer number given by user using class
import java.util.*;
class Main{
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.println("enter your number: ");
		int n=sc.nextInt();
		count c1=new count();
		System.out.println("count of digits is: "+c1.count(n));
	}
}
class count{
	int r;
	int prod=1;
	int count(int num){
		while(num>0){
			r=num%10;
			prod*=r;
			num/=10;
		}
		return prod;
	}
}