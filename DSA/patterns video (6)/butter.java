import java.util.*;
/*
*      * 
**    **
***  ***
********
********
***  ***
**    **
*      *
*/
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of rows: ");
		int n=sc.nextInt();
		//upper half.
		for(int i=1;i<=n;i++){
			//for first half.
			for(int a=1;a<=i;a++){
				System.out.print("*");
			}
			//for spaces.
			for(int a=(n-i)*2;a>=1;a--){
				System.out.print(" ");
			}
			//for second half.
			for(int a=1;a<=i;a++){
				System.out.print("*");
			}System.out.println();
		}
		//lower half.
		for(int i=n;i>=1;i--){
			//for first half.
			for(int a=i;a>=1;a--){
				System.out.print("*");
			}
			//for spaces.
			for(int a=1;a<=(n-i)*2;a++){
				System.out.print(" ");
			}
			//for second half.
			for(int a=i;a>=1;a--){
				System.out.print("*");
			}System.out.println();
		}
	}
}