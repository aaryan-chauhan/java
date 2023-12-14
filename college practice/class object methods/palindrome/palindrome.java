import java.util.*;
//palindrome 
//1.no return no argument.
class nnpalindrome{
	static Scanner sc=new Scanner(System.in);
	void nretnarg(){
		System.out.println("enter your number for 1: ");
		int n=sc.nextInt(); 
		int i=n;
		int r=0;
		int rev=0;
		while(n>0){
			r=n%10;          //for getting the last number
			rev=rev*10+r;    //adding the last number into the new variable
			n/=10;           //removing the last number 
		}
		if(i==rev){          //checking if given number is equal to reversed number
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}
}
//2.no return with argument.
class nwpalindrome{
	static Scanner sc=new Scanner(System.in);	
	void nretyarg(int numnw){
		int i=numnw;
		int r=0;
		int rev=0;
		while(numnw>0){
			r=numnw%10;          //for getting the last number
			rev=rev*10+r;        //adding the last number into the new variable
			numnw/=10;           //removing the last number 
		}
		if(i==rev){          //checking if given number is equal to reversed number
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}
}
//3.with return no argument. 
class wnpalindrome{
	static Scanner sc=new Scanner(System.in);	
	boolean wretnarg(){
		System.out.println("enter your number for 3: ");
        int n=sc.nextInt(); 		
		int i=n;
		int r=0;
		int rev=0;
		boolean b=true;
		while(n>0){
			r=n%10;          //for getting the last number
			rev=rev*10+r;    //adding the last number into the new variable
			n/=10;           //removing the last number 
		}
		if(i==rev){          //checking if given number is equal to reversed number
			b=true;
			return b;
		}else{
			b=false;
			return b;
		}
	}
}
//4.with return with argument
class wwpalindrome{
	static Scanner sc=new Scanner(System.in);	
	boolean wretwarg(int n){	
		int i=n;
		int r=0;
		int rev=0;
		boolean b=true;
		while(n>0){
			r=n%10;          //for getting the last number
			rev=rev*10+r;    //adding the last number into the new variable
			n/=10;           //removing the last number 
		}
		if(i==rev){          //checking if given number is equal to reversed number
			b=true;
			return b;
		}else{
			b=false;
			return b;
		}
	}
}

class Main{
	static Scanner sc=new Scanner(System.in);	
	public static void main(String args[]){
		//for 1
		nnpalindrome n1=new nnpalindrome();
		n1.nretnarg();
		//for 2
		nwpalindrome n2=new nwpalindrome();
		System.out.println("enter your number for 2: ");
		int numnw=sc.nextInt();
		n2.nretyarg(numnw);
		//for3
		wnpalindrome n3=new wnpalindrome();
	    if(n3.wretnarg()==true){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
		//for 4
		wwpalindrome n4=new wwpalindrome();
		System.out.println("enter your number for 4: ");
        int numww=sc.nextInt(); 	
		if(n4.wretwarg(numww)==true){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}	}
}