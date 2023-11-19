import java.util.*;
class conditions{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter maths marks");
		int maths=sc.nextInt();
		System.out.println("enter phy marks");
		int phy=sc.nextInt();
		System.out.println("enter chem marks");
		int chem=sc.nextInt();
		byte avg=(maths+phy+chem)/3;
		if(maths>33&&phy>33&&chem>33){
			if(avg>40){
				System.out.println("you pass");
			}else{
				System.out.println("oops you fail because avg= "+avg);
			}
		}else{
			System.out.println("oops you fail");
		}
	}
}