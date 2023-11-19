import java.util.*;
class conditions{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int age =sc.nextInt();
		boolean cond=(age>18);
		if(cond){
				System.out.println("yes you can drive");
		}else{
				System.out.println("no you can't drive");
		}
	}
}