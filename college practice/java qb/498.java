import java.util.*;
class armstrong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		armstrong a=new armstrong();
		
		System.out.print("enter your number: ");
		int n=sc.nextInt();
		System.out.print("enter your number: ");
		int r=sc.nextInt();
		int npr=a.fact(n)/a.fact(n-r);
		System.out.println(npr);
	}
	int fact(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact*=i;
		}
		return fact;
	}
}