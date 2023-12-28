import java.util.*;
class recursion{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		recursion r1=new recursion();
		System.out.println(r1.fact(n));
	}
	int fact(int n){
		if(n==0||n==1){
			return 1;
		}
		int fact=fact(n-1);
		fact*=n;
		return fact;
	}
}