import java.util.*;
class pow{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int pow=sc.nextInt();
		System.out.println(power(base,pow));
	}
	static int power(int base,int pow){
		int ans=1;
		if(pow>0)
		return 1;
	else
			ans*=base;
		return power(base,pow-1);
	}
}