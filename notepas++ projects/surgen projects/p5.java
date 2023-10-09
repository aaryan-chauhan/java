//ELECTRICITY BILL
import java.util.*;
class p5{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter full name: ");
		String name=sc.nextLine();
		System.out.print("Enter number of units consumed: ");
		double units= sc.nextDouble();
		
		double totalBill=0.0;
		double finalTotalBill=0.0;
		double meter=100;
		
		if(units<=50){
			totalBill=(units*0);
		}else if(units<=200&&units>50){
			totalBill=(50*0)+((units-50)*0.80);
		}else if(units<=300&&units>200){
			totalBill=(50*0)+(150*0.80)+((units-200)*0.90);
		}else{
			totalBill=(50*0)+(150*0.80)+(100*0.90)+((units-250)*1);
		}
		
		if(totalBill>=400){
			finalTotalBill=((0.15*totalBill)+totalBill)+meter;
		}else{
			finalTotalBill=totalBill+meter;
		}
		System.out.print("Total bill: "+finalTotalBill);
	}
}