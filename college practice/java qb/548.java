import java.util.*;
/*Write a Java program to perform basic Calculator operations using following
methods catagories:
sum() - without arguments without return,
minus() - with arguments without return,
multi() - without arguments with return
divide() - with arguments with return*/
class main{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		calculator c=new calculator();
		boolean b=true;
		while(b){
			System.out.println("enter 1 for addition \nenter 2 for subtraction \nenter 3 for multiplication \nenter 4 for division \nenter 5 for exit ");
			int cal=sc.nextInt();
			switch(cal){
				case 1:
				c.sum();
				break;
				
				case 2:
				System.out.println("enter first number: ");
				int mina=sc.nextInt();
				System.out.println("enter second number: ");
				int minb=sc.nextInt();
				c.minus(mina,minb);
				break;
				
				case 3:
				System.out.print(c.multi());
				break;
				
				case 4:
				System.out.println("enter first number: ");
				int diva=sc.nextInt();
				System.out.println("enter second number: ");
				int divb=sc.nextInt();
				System.out.println(diva+"/"+divb+" is: "+c.divide(diva,divb));
				break;
				
				case 5:
				System.out.println("you exit");
				b=false;
				break;
				
				default:
				System.out.println("enter only 1-5");
				continue;
			}
		}
	}
}
class calculator{
	static Scanner sc=new Scanner(System.in);
	void sum(){
		System.out.println("you will perform addition");
		System.out.println("enter first number: ");
		int a=sc.nextInt();
		System.out.println("enter secpnd number number: ");
		int b=sc.nextInt();
		System.out.println(a+"+"+b+" is: "+(a+b));
	}
	void minus(int a,int b){
		System.out.println("you will perform subtraction");
		System.out.println(a+"-"+b+" is: "+(a-b));
	}
	int multi(){
		System.out.println("you will perform multiplication");
		System.out.println("enter first number: ");
		int a=sc.nextInt();
		System.out.println("enter secpnd number number: ");
		int b=sc.nextInt();
		int c= a*b;
		System.out.println(a+"*"+b+" is: ");
		return c;
	}
	int divide(int a,int b){
		int c=a/b;
		return c;
	}
}