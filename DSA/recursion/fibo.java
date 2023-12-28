import java.util.*;
class recursion{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		recursion r1=new recursion();
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.print(a+", "+b);
		r1.fibo(a,b,n-2);
	}
	int fibo(int a,int b,int n){
		if(n==0){
			return 1;
		}
		int c=a+b;
		a=b;
		b=c;
		System.out.print(", "+c);
		return fibo(a,b,n-1);
	}
}