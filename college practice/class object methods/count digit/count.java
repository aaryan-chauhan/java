import java.util.*;
//to find how many digit a number has.
class count{
	static Scanner sc=new Scanner (System.in);
	//1.no return no argument.
	void nncount(){
		System.out.println("enter your number for no return no argument: ");
		int n=sc.nextInt();
		int count;
		while(n>0){
			count++;
			n/=10;
		}
		System.out.println("number of digits: "+ count);
	}
	//2.no return with argument.
	void nwcount(int n){
		int count;
		while(n>0){
			count++;
			n/=10;
		}
		System.out.print(count);
	}
	//3.with return no argument
	int wncount(){
		System.out.println("enter your number for with return no argument: ");
		int n=sc.nextInt();
		int count;
		while(n>0){
			count++;
			n/=10;
		}
		return count;
	}
	//4.with return with argument
	int wwcount(int n){
		int count;
		while(n>0){
			count++;
			n/=10;
		}
		return count;
	}
	public static void main(String args[]){
		//for 1
		count c1=new count();
		c1.nncount();
		//for 2
		System.out.println("enter your number for no return with argument:");
		int nnw=sc.nextInt();
		c1.nwcount(nnw);
		//for 3
		c1.wncount();
		//for 4
		System.out.println("enter your number for with return with argument:");
		int nww=sc.nextInt();
		c1.wwcount(nww);
	}
}