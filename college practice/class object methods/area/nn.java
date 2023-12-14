import java.util.*;
//no return no argument area and perimeter using scanner class for user input.
class areaperi{
	Scanner sc=new Scanner (System.in);
	void area(){                              //no argument
		System.out.println("enter length: ");
		int l=sc.nextInt();
		System.out.println("enter breadth: ");
		int b=sc.nextInt();
		int area=l*b;
		System.out.println("area: "+area);
	}
	void perimeter(){
		System.out.println("enter length: ");
		int l=sc.nextInt();
		System.out.println("enter breadth: ");
		int b=sc.nextInt();
		int perimeter =2*(l+b);
		System.out.println("perimeter: "+perimeter);
	}
	public static void main(String args[]){
		areaperi ap1=new areaperi();
		ap1.area();               //**void area()** code will come here.
		ap1.perimeter();          //**void perimeter()** code will come here    
	}
}