 /*Write a program for given below information:
A student will not be allowed to sit in exam if his/her attendance is less than
75%.
Take following input from user using scanner class.
1.Number of classes held (Take int datatype)
2.Number of classes attended (Take int datatype)
And print percentage of class attended in real data type.
If student has not any medical cause and attendance criteria not fulfilled then
directly print “ You are not eligible to sit in exam”.
Allow student to sit if he/she has medical cause Ask user if he/she has medical
cause or not ( 'Y' ,’y’ for Yes or 'N', ’n’ for No) in char form and attendance >=60%
and <=74%, then print message “You can sit in exam” otherwise print “You are
not eligible to sit in exam”.*/

import java.util.*;

class attendence{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("number of classes held in total");
		int classHeld=sc.nextInt();
		System.out.println("number of classes attended");
		int classAttended=sc.nextInt();
		double percentage = ((double)classAttended/(double)classHeld)*100;
		System.out.println("percentage of attendence"+ percentage);
		if(percentage>75.00){
			System.out.println("you can sit in exam");
		}else if (percentage<=75.00&&percentage>=60){
			System.out.println("dis you have a medical issue? answer in Y and N ");
			char medicalIssue=sc.next().charAt(0);
			switch(medicalIssue){
				case 'y':
				case 'Y':System.out.println("you can sit in exam");
				break;
				case 'n':
				case 'N':System.out.println("you can not sit in exam");
				break;
				default : System.out.println("enter only y,Y or N,n");
			}
		}else{
			System.out.println("you can not sit in exam");
		}
	}
}