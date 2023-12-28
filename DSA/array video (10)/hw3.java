//Take an array of numbers as input and check if it is an array sorted in ascending order.
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
		int b[]=new int [a.length];
		//for assigning ascending order of array.
		for (int i=0;i<b.length;i++){
			b[i]=a[i];
		}
		int min=b[0];
		//for making second array as ascending 
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
				if(b[i]<b[j]){
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		boolean bo=true;
		//for checking first and second array
		for (int i=0;i<b.length;i++){
			if(b[i]==a[i]){
				bo=true;
			}else{
				bo=false;
			}
		}
		if(bo==true){
			System.out.println("yes ascending!");
		}else{
			System.out.println("not ascending!");
		}
	}
}