import java.util.*;
//prime number or not using functions.
//wrong logic used for 1 and 2 ignore it i am not going to fix it
class prime{
    static Scanner sc=new Scanner (System.in);
	//1.no return no argument
	public static void nrna(){
		//loop for prime
		System.out.println("enter valid no for 1: ");
		int num=sc.nextInt();
		for(int i=2;i<num;i++){
			if(num%i==0){
			}else{
				System.out.println("prime");
				return;
			}
		}
				System.out.println("not prime");
	}
	//2. no return with argument.
	public static void nrya(int num){
		//loop for prime
		for(int i=2;i<num;i++){
			if(num%i==0){
			}else{
				System.out.println("prime");
				return;
			}
		}
				System.out.println("not prime");
	}
	//3. with return no argument.
	public static String yrna(){
		//loop for prime
		System.out.println("enter valid no for 3: ");
		int num=sc.nextInt();
		for(int i=1;i<num;i++){
			if(num%i==0||i!=1){
				String y="prime";
			}else{
				String n="not prime";
				return n;
			}
		}
				return "prime";
	}
	//4. with return with argument 
	public static String yrya(int num){
		for(int i=1;i<num;i++){
			if(num%i==0||i!=1){
			}else{
				String n="not prime";
				return n;
			}
		}
				return "prime";
	}

	public static void main(String args[]){
		//for 1
		nrna();
		//for 2
		System.out.println("enter valid no for 2: ");
		int num=sc.nextInt();
		nrya(num);
		//for 3
		System.out.println(yrna());
		//for 4
		System.out.println("enter valid no for 4: ");
		int num2=sc.nextInt();
		System.out.println(yrya(num2));
		
	}
}