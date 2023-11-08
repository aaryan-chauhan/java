/*WAP to calculate the Area of a Circle, Area and Perimeter of rectangle, Area of
Triangle.*/

import java.util.*;

class areaPerimeterScan{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		
		
		//for circle
		System.out.print("for circle ");
		System.out.println("enter radius");
		double r = sc.nextDouble();
		double pi= Math.PI;
		double perimeterCirle = 2*r*pi;
		double areaCircle = r*r*pi;
		// System.out.println("perimeter is: "+perimeter); it is not asked 
		System.out.println("area is: "+areaCircle);
		
		
		//now for rectangle
		System.out.print("for rectangle ");
		System.out.println("enter length");
		double l = sc.nextDouble();
		System.out.println("enter breadth");
		double b = sc.nextDouble();
		double perimeterRectancle = (double)2*(l+b);
		double areaRectancle = l*b;
		System.out.println("perimeter is: "+perimeterRectancle);
		System.out.println("area is: "+areaRectancle);
		
		
		//now for triangle
		System.out.print("for triangle ");
		System.out.println("enter first side length");
		double x = sc.nextDouble();
		System.out.println("enter second side length");
		double y = sc.nextDouble();
		System.out.println("enter third side length");
		double z = sc.nextDouble();
		System.out.println("enter height");
		double h = sc.nextDouble();
		System.out.println("enter base length");
		double base = sc.nextDouble();
		double perimeterTriangle =x+y+z;
		double areaTriangle = (double)1/(double)2*(h*base);
		System.out.println("perimeter is: "+perimeterTriangle);
		System.out.println("area is: "+areaTriangle);
	}
}