import java.util.*;
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
			//for space
			for(int k=i-1;k>=1;k--){
				System.out.print(" ");
			}
			//for printing *.
			for (int j=1;j<=n-i+1;j++){
				System.out.print(" *");
			}System.out.println();
		}
		//reverse logic
		for (int i=1;i<=n;i++){
			//for space
			for (int k=n-i;k>=1;k--){
				System.out.print(" ");
			}
			//for printing *
			for (int j=1;j<=i;j++){
				System.out.print(" *");
			}System.out.println();
		}
	}
}