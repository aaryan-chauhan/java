import java.util.*;
class armstrong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		armstrong a=new armstrong();
		System.out.print("enter your number: ");
		int num=sc.nextInt();
		if(a.armstrong(a.count(num),num)==num){
			System.out.println("Armstrong number");
		}else{
			System.out.println("not armstrong number");
			
		}
	}
	int count(int n){
		int count=0;
		while(n>0){
			count++;
			n/=10;
		}
		return count;
	}
	int armstrong(int n,int num){
		int r=0;
		int arm=0;
		while(num>0){
			r=num%10;
			arm+=Math.pow(r,n);
			num/=10;
		}
		return arm;
	}
}