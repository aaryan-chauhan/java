//ADANI BILL QUESTION
import java.util.*;
class p2{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		double previousBillSeptember=1774.86;
		double gstPercentage=0.18;
		
		double pricePerUnitBeforeOctober=0.0;
		
		System.out.print("Enter units used in october: ");
		int a=sc.nextInt();
		
		double billOctober=0.00;
		if(a<=50){
			pricePerUnitBeforeOctober=2.0;
		}else if(a<=250){
			pricePerUnitBeforeOctober=10.0;
		}else if(a<=350){
			pricePerUnitBeforeOctober=13.0;
		}else if(a<=500){
			pricePerUnitBeforeOctober=18.0;
		}else{
			pricePerUnitBeforeOctober=25.0;
		}
		
		billOctober= (a*(pricePerUnitBeforeOctober+5.0));
		double billOctoberGst=(billOctober+(gstPercentage*billOctober));
		
		double billDifference=(billOctoberGst-previousBillSeptember);
		
		System.out.println("Bill for September(with gst): "+previousBillSeptember);
		System.out.println("Bill for October(with gst): "+billOctoberGst);
		System.out.println("Difference in bills: "+billDifference);
	}
}