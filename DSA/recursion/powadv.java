import java.util.*;
class recursion{
	int ans=1;
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.print("enter base: ");
		int base=sc.nextInt();	
		System.out.print("enter pow: ");
		int pow=sc.nextInt();
		recursion r1=new recursion();
		System.out.println(r1.power(base,pow));
	}
	int power(int base,int pow){
		if(pow==0){
			return ans;
		}
		ans*=base;
		return power(base,pow-1);		
	}
}