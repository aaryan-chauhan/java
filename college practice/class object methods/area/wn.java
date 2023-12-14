import java.util.*;
//with return no argument area and perimeter.

/*
Question: 
can you use command line argument in this program?? if yes then use 
command line to take user input and share me the code.!!!
*/

class areaperi{
	Scanner sc=new Scanner(System.in);
	int area(){
		System.out.println("enter length: ");
		int al=sc.nextInt();
		System.out.println("enter breadth: ");
		int ab=sc.nextInt();
		int area=ab*al;
		return area;
	}
	int perimeter(){
		System.out.println("enter length: ");
		int pl=sc.nextInt();
		System.out.println("enter breadth: ");
		int pb=sc.nextInt();	
		int perimeter=((pb+pl)*2);
		return perimeter;
	}
	public static void main(String args[]){
		areaperi ap1=new areaperi();
		/*below code will give us the value returned in the program that is called */
		System.out.println("area: "+ap1.area());
		System.out.println("perimeter: "+ap1.perimeter());//this will do same as above
	}
}