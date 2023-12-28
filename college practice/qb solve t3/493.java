//Write a Java program to find area and perimeter of a circle having radious=5
//units using class Circle.
class circle{
	void areaperi(){
		int r=5;
		int peri=(int)Math.round(r*2*Math.PI);
		int area=(int)Math.round(r*r*Math.PI);
		System.out.println("perimeter is: "+peri);
		System.out.println("area is: "+area);
	}
}
class Main{
	public static void main(String args[]){
		circle c1=new circle();
		c1.areaperi();
	}
}