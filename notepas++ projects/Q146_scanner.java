/*Write a program that displays the area and perimeter of a circle that has a radius
of 5 using the following formula: perimeter = 2 * radius * pi area = radius *
radius * pi*/

import java.util.*;

class areaPerimeterScan{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius");
		double r = sc.nextDouble();
		double pi= Math.PI;
		double perimeter = 2*r*pi;
		double area = r*r*pi;
		System.out.println("perimeter is: "+perimeter);
		System.out.println("area is: "+area);
	}
}