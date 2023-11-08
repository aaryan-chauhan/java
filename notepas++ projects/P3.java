/*WAP that reads number from 1 to 7 and accordingly it should print MONDAY to
SUNDAY by using Switch statement.*/

import java.util.*;

class numberToDay{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number from range 1-7 to convert to consecutive day");
		int num =sc.nextInt();
		switch(num){
			case 1 :
		System.out.println("Monday");
			break;
		case 2 :
		System.out.println("Tueday");
			break;
		case 3 :
		System.out.println("Wednesday");
			break;
		case 4 :
		System.out.println("Thursday");
			break;
		case 5 :
		System.out.println("Friday");
			break;
		case 6 :
		System.out.println("Saturday");
			break;
		case 7 :
		System.out.println("Sunday");
			break;
			default:System.out.println("enter number from range 1-7");
		}
	}
}
