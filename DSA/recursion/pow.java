import java.util.*;
class recursion{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter base: ");
		int base=sc.nextInt();
		System.out.print("enter pow: ");
		int pow=sc.nextInt();
		recursion r1=new recursion();
		System.out.println(r1.pow(base,pow));
	}
	int pow(int base,int pow){
		if(pow==0){
			return 1;
		}
		int ans=pow(base,pow-1);
		ans*=base;
		return ans;
	}
}