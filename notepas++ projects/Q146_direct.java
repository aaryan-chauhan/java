/*Write a program that displays the area and perimeter of a circle that has a radius
of 5 using the following formula: perimeter = 2 * radius * pi area = radius *
radius * pi*/

class areaPerimeter{
	public static void main(String[]args){
		double r = 5;
		double pi= Math.PI;
		double perimeter = 2*r*pi;
		double area = r*r*pi;
		System.out.println("perimeter is: "+perimeter);
		System.out.println("area is: "+area);
	}
}