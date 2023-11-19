import java.util.*;
class patterns{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.print("enter number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			// for space
			for(int k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			// for print
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			//for space
			for(int k=n-i;k>=1;k--){
				System.out.print(" ");
			}
			//for printing
			for (int j=i;j>=1;j--){
				System.out.print("* ");
			}System.out.println();
		}
	}
}