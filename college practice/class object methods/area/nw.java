import java.util.*;
//no return with argument area perimeter using scanner class for user input.
class areaperi{
	static Scanner sc=new Scanner(System.in);
	void area(int l ,int b){//argument declaration in ()brackets
		System.out.println("area: "+(l*b));//operations of argument variables
	}
	void perimeter(int l, int b){//argument declaration in ()brackets
		System.out.println("perimeter: "+(2*(l+b)));//operations of argument variables
	}
	public static void main(String args[]){
		areaperi ap1=new areaperi();//calling the class so that I can use the methods of that class
		System.out.println("enter length for area: ");
		int al=sc.nextInt();//user input for length to find area
		System.out.println("enter breadth for area: ");
		int ab=sc.nextInt();//user input for breadth to find area
		ap1.area(al,ab);//the **void area()** code will come here
		System.out.println("enter length for perimeter: ");
		int pl=sc.nextInt();//user input for length to find perimeter
		System.out.println("enter breadth for perimeter: ");
		int pb=sc.nextInt();//user input for breadth to find perimeter
		ap1.perimeter(pl,pb);//the **void perimeter()** code will come here
	}
}