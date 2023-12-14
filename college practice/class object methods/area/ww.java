import java.util.*;
//with return with argument area perimeter.

/*
Question: 
can you use command line argument in this program?? if yes then use 
command line to take user input and share me the code.!!!
*/

class areaperi{
	static Scanner sc=new Scanner(System.in);
	int area(int l,int b){
		int area=l*b;
		return area;
	}
	int perimeter(int l,int b){
		int perimeter=2*(l+b);
		return perimeter;
	}
	public static void main(String args[]){
		areaperi ap1=new areaperi();
		System.out.println("enter length: ");
		int al=sc.nextInt();
		System.out.println("enter breadth: ");
		int ab=sc.nextInt();
		System.out.println("area: "+ap1.area(al,ab));
		System.out.println("enter length: ");
		int pl=sc.nextInt();
		System.out.println("enter breadth: ");
		int pb=sc.nextInt();
		System.out.println("perimeter: "+ap1.perimeter(pl,pb));
	}
}