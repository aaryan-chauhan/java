import java.util.*;
//Write a Java program to count digits of an integer number given by user using class.
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
	int r,count;
	int count(int num){
		while(num>0){
			r=num%10;
			count++;
			num/=10;
		}
		return count;
	}
}