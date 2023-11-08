/* Q.240 
Write a Java program to input electricity unit charges and calculate total
electricity bill
according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill. Use Scanner class for input of
electricity units.*/

import java.util.*;

class bill{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the units used");
		int units = sc.nextInt();
		double charge ;
		if((units>0)&&(units<=50)){
			charge = units*0.50;
		System.out.println(charge);
		}else if ((units>50)&&(units<=150)){
			charge = ((double)50*0.50)+(double)(units-50)*0.75;
		System.out.println(charge);
		}
		else if ((units>150)&&(units<=250)){
				charge = ((double)50*0.50)+((double)100*0.75)+(double)(units-150)*0.75;
		System.out.println(charge);
		}
		else if ((units>150)&&(units<=250)){
					charge = ((double)50*0.50)+((double)100*0.75)+(double)(units-150)*1.20;
		System.out.println(charge);
					
		}else if(units>250){
			charge = ((double)50*0.50)+((double)100*0.75)+((double)100*1.20)+(double)(units-150)*1.50;
		charge=charge + ((20/100)*charge);
		System.out.println(charge);
		}
	}
}