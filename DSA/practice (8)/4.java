import java.util.*;
//Write a function that takes in the radius as input and returns the circumference of a circle.
class circumference{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter radius: ");
		int r=sc.nextInt();
		System.out.println("circumference is: "+circum(r));
	}
	public static double circum(int n){
		double circum=2*n*Math.PI;
		return circum;
	}
}