import java.util.*;
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number of rows");
		int row=sc.nextInt();
		System.out.println("Enter number of cols");
		int col=sc.nextInt();
		//using if else
		for(int i=1;i<=row;i++){
			for (int j=1;j<=col;j++){
				if(i>=j){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}System.out.println();
		}
		//without using if else
		for(int i=1;i<=row;i++){
			for (int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}	
		//using reverse logic
		for(int i=row;i>=0;i--){
			for (int j=1;j<=col;j++){
					System.out.print("* ");
			}System.out.println();
		}
	}
}