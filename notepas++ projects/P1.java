/*WAP by using switch case to print grade of a student using following rules :
Percentage >70 means Grade A
Percentage 60-70 means Grade B
Percentage 50-60 means Grade C
Percentage <50 means Grade F*/
import java.util.*;

class grading{
	public static void main(String[]args){
		System.out.println("Enter your percentage");
		Scanner sc = new Scanner(System.in);
		int percentage = sc.nextInt();
		if(percentage<50){
			percentage = 1;
		}
		if((percentage>50)&&(percentage<60)){
			percentage = 2;
		}
		if((percentage>60)&&(percentage<70)){
			percentage = 3;
		}
		if(percentage>70&&(percentage<100)){
			percentage = 4;
		}
		switch(percentage){
			case 1:
			System.out.println("Grade F");
			break;
			case 2:
			System.out.println("Grade C");
			break;
			case 3:
			System.out.println("Grade B");
			break;
			case 4:
			System.out.println("Grade A");
			break;
			default: 
			System.out.println("Enter valid number from between 1-100");
		}
	}
}