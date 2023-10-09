import java.util.*;
class p4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("No of classes held: ");
		int classHeld=sc.nextInt();
		System.out.print("No of classes attended: ");
		int classesAttended=sc.nextInt();
		
		double per=((double)classesAttended/classHeld)*100;
		System.out.println("Percentage: "+per+"%");
		
		if(per>=75){
			System.out.print("You are eligible to sit in exam");
		}
		
		if(per<75){
			System.out.print("Do you have any medical causes? ");
			char c=sc.next().charAt(0);
			if((c=='y'||c=='Y')&&(per>=60&&per<=74)){
				System.out.print("You are eligible to sit in exam");
			}else{
				System.out.print("You are not eligible to sit in exam");
			}
			
		}
	}
}