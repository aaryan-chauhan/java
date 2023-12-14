import java.util.*;
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no. of rows and cols: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for (int j=n;j>=i;j--){
				System.out.print("* ");
			}System.out.println();
		}
		//using if else
		for(int i=1;i<=n;i++){
			for (int j=n;j>=1;j--){
				if(i<=j){
					System.out.print("* ");
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
		//using reverse code
		for (int i=n;i>=1;i--){
			for (int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
	}
}