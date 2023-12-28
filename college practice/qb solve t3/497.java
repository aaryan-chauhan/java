//Write a Java program to check whether a number given by user is Armstrong or not using class
import java.util.*;
class Main{
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.println("enter your number: ");
		int n=sc.nextInt();
		count c1=new count();
		if(c1.count(n)==n){
			System.out.println("armstrong");
		}else{
			System.out.println("not armstrong");
		}
	}
}
class count{
	int r,count,armstrong;
	int count(int num){
		int n=num;
		while(num>0){
			r=num%10;
			count++;
			num/=10;
		}
		while(n>0){
			r=n%10;
			armstrong+=Math.pow(r,count);
			n/=10;
		}
		return armstrong;
	}
}