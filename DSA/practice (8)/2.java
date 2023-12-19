import java.util.*;
//Write a function to print the sum of all odd numbers from 1 to n.
class sum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		//with return with argument.
		System.out.println(sum(n1));
	}
	public static int sum(int a){
		//loop for sum.
		int sum=0;
		for(int i=1;i<=a;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		return sum;
	}
}