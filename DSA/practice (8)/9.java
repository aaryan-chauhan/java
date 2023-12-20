import java.util.*;
//write a java function that gives highest common factor from the given 2 numbers
class hcf{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		hcf h1=new hcf();
		System.out.println("enter your first number: ");
		int n1=sc.nextInt();
		System.out.println("enter your second number: ");
		int n2=sc.nextInt();
		System.out.println("hcf is: "+h1.hcf(n1,n2));
	}
	public static int hcf(int a ,int b){
		int hcf=1;
		for (int i=1;(i<=a)||(i<=b);i++){
			if(a%i==0&&b%i==0){
				hcf=i;
			}
		}
		return hcf;
	}
}