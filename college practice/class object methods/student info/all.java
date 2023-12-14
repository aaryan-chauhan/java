import java.util.*;
class info{
	static Scanner sc=new Scanner(System.in);
	//1. no return no argument.
	void nninfo(){
		System.out.println("**no return no argument**");
		System.out.print("enter name: ");
		String name=sc.next();
		System.out.print("enter roll no: ");
		int roll=sc.nextInt();
		System.out.print("enter division: ");
		String div=sc.next();

		System.out.println("printing info by no return no argument: "+name+" "+roll+" "+div);
	}
	//2. no return with argument.
	void nwinfo(String name, int roll, String div){
		System.out.println("printing info by no return with argument: "+name+" "+roll+" "+div);
	}
	//3. with return no argument.
	String wninfo(){
		System.out.println("**with return no argument**");
		System.out.print("enter name: ");
		String name=sc.next();
		System.out.print("enter roll no: ");
		int roll=sc.nextInt();
		System.out.print("enter division: ");
		String div=sc.next();
		String info=name+" "+roll+" "+div;
		return info;
	}
	//4. with return with argument.
	String wwinfo(String name, int roll, String div){
		String info=(name+" "+roll+" "+div);
		return info;
	}
	public static void main(String args[]){
		//for calling info class
		info i1=new info();
		
		//for 1 
		i1.nninfo();
		
		//for 2
		System.out.println("**no return with argument**");
		System.out.print("enter name: ");
		String name=sc.next();
		System.out.print("enter roll no: ");
		int roll=sc.nextInt();
		System.out.print("enter division: ");
		String div=sc.next();
	    i1.nwinfo(name,roll,div);
		
		//for 3
		System.out.println("Student info: printing info with return no argument: "+i1.wninfo());
		
		//for 4
		System.out.println("**with return with argument**");
		System.out.print("enter name: ");
		String name4=sc.next();
		System.out.print("enter roll no: ");
		int roll4=sc.nextInt();
		System.out.print("enter division: ");
		String div4=sc.next();
	    System.out.println("Student info: printing info with return with argument: "+i1.wwinfo(name4,roll4,div4));
	}
}