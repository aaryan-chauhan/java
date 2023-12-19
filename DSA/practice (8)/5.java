import java.util.*;
//Write a function that takes in age as input and returns if that person is eligible to vote or not
class max{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter age: ");
		int age=sc.nextInt();
		if(is18(age)){
			System.out.println("eligible to vote");
		}else{
			System.out.println("not eligible to vote");
		}
	}
	public static boolean is18(int a1){
		boolean is18;
		if(a1>18){
			is18=true;
		}else{
			is18=false;
		}
		return is18;
	}
}