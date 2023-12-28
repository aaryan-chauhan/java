//Write a Java program to check whether a given number given by user is
//palindrome or not using class
import java.util.*;
class Main{
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.println("enter your number: ");
		int n=sc.nextInt();
		count c1=new count();
		if(c1.count(n)==n){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
		
	}
}
class count{
	int r;
	int rev;
	int count(int num){
		while(num>0){
			r=num%10;
			rev=rev*10+r;
			num/=10;
		}
		return rev;
	}
}