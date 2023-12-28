//Find the maximum & minimum number in an array of integers. 
import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of elements you want to enter: ");
		int length=sc.nextInt();
		int a[]=new int[length];
		for (int i=0;i<a.length;i++){
			System.out.print("enter "+i+" th number: ");
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		
		for (int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}else if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("max is: "+max);
		System.out.println("min is: "+min);
	}
}