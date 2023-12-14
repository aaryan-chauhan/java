import java.util.*;
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// for space
		for(int i=1;i<=4;i++){
			for (int j=1;j<=i;j++){
				System.out.print("*");
			}
		
		
		//for printing
		
			for (int j=5;j>5-i;j--){
				System.out.print("*");
			}System.out.println();
		}
	}
}