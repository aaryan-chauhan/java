/*WAP to perform addition, multiplication, subtraction and division with Switch
statement.*/
import java.util.*;

class operations{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		double a = sc.nextDouble();
		System.out.println("enter valid operator ");
		char operator = sc.next().charAt(0); 
		System.out.println("enter second number");
		double b = sc.nextDouble();  
		if(operator=='+'){
			operator=1;
		}
		else if(operator=='*'){
			operator=2;
		}
		else if(operator=='-'){
			operator=3;
		}
		else if(operator=='/'){
			operator=4;
		}else if(operator=='%'){
			operator=5;
		}else{
			System.out.println("enter valid operator");
		}
		switch(operator){
			case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a*b);
			break;
		case 3:
			System.out.println(a-b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		case 5:
			System.out.println(a%b);
			break;
		default:
			System.out.println("enter any 4 operator from +,-,*,/");
			break;
		}
	}
}