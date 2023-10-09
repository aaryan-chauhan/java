//CALCULATOR
import java.util.*;
class p3{
	
	 public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=Integer.parseInt(args[0]);
		System.out.println("The first number is " +a);
		System.out.print("Enter operator: ");
		char b=sc.next().charAt(0);
		System.out.print("The second number is ");
		int c= sc.nextInt();
		
		switch(b){
			case '+':System.out.print("Answer is "+(a+c)); break;
			case '-':System.out.print("Answer is "+(a-c)); break;
			case '*':System.out.print("Answer is "+(a*c)); break;
			case '/':System.out.print("Answer is "+(a/c)); break;
			case '%':System.out.print("Answer is "+(a%c)); break;
		}	
	 }
}