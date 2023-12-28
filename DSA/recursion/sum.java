import java.util.*;
class recursion{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		System.out.print("enter your number: ");
		int n=sc.nextInt();
		recursion r1=new recursion();
		System.out.print(r1.printsum(n,0));
	}
	int printsum(int n,int sum){
		if(n==0){
			return sum;
		}
		sum+=n;
		return printsum(n-1,sum);
	}
}