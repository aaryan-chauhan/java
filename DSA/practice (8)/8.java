//Two numbers are entered by the user, x and n. 
//Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.*;
class pow{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number: ");
		int n1=sc.nextInt();
		System.out.println("enter second number: ");
		int n2=sc.nextInt();
		pow p1=new pow();
		System.out.println("ans by normal call is: "+pow(n1,n2));
		System.out.println("ans by class call is: "+p1.pow(n1,n2));
	}
	public static int pow(int a,int b){
		return ((int)Math.pow(a,b));
	}
}
