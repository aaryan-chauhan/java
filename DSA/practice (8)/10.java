import java.util.*;
//fibonacci series
class fibo{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the position you want to know number at fibonacci seirs: ");
		int a=sc.nextInt();
		System.out.println("number at "+a+" is: "+fibo(a));
	}
	public static int fibo(int n){
		int a=0;
		int b=1;
		int temp=0;
		//loop for fibonacci series
		if(a==1){
			return 0;
		}else if(a==2){
			return 1;
		}else{
			for(int i=3;i<=n;i++){
				temp=a+b;
				a=b;
				b=temp;
			}
		}
		return temp;
	}
}