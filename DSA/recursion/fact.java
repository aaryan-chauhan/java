import java.util.*;
class recursion{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		recursion r1=new recursion();
		System.out.println(r1.fact(n,1));
	}
	int fact(int n,int fact){
		if(n==0){
			return fact;
		}
		fact*=n;
		return fact(n-1,fact);
	}
}