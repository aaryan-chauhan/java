import java.util.*;
class conditions{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int age =sc.nextInt();
		boolean cond=(age>30);
		if(cond){
			System.out.println("you can drive fast");
		}else if(age>18){
			System.out.println("yes you can drive");
		}else{
			System.out.println("no you can't drive");
		}
		//switch case
		int age1 =sc.nextInt();
		switch(age1){
			case 18:
			System.out.println("you have become an adult");
			break;
			case 21:
			System.out.println("you can marry now");
			break;
			default:
			System.out.println("enjoy your life");
		}
	}
}