//no return with argument area perimeter using command line argument for user input.
class areaperi{
	void area(int l ,int b){//argument declaration in ()brackets
		System.out.println("area: "+(l*b));//operations of argument variables
	}
	void perimeter(int l, int b){//argument declaration in ()brackets
		System.out.println("perimeter: "+(2*(l+b)));//operations of argument variables
	}
	public static void main(String args[]){
		/*
		here command line argument is possible as we are taking 
		user inputs inside the main class where we have declared the 
		string array (that is **args**) in the argument
		*/
		areaperi ap1=new areaperi();//calling the class so that I can use the methods of that class
		System.out.println("enter length for area: ");
		int al=Integer.parseInt(args[0]);//user input for length to find area
		System.out.println("enter breadth for area: ");
		int ab=Integer.parseInt(args[1]);//user input for breadth to find area
		ap1.area(al,ab);//the **void area(int l ,int b)** code will come here
		System.out.println("enter length for perimeter: ");
		int pl=Integer.parseInt(args[2]);//user input for length to find perimeter
		System.out.println("enter breadth for perimeter: ");
		int pb=Integer.parseInt(args[3]);//user input for breadth to find perimeter
		ap1.perimeter(pl,pb);//the **void perimeter(int l, int b)** code will come here
	}
}