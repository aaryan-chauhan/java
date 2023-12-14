import java.util.*;
/*
    *****
   *****
  *****
 *****
*****	
*/

class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no. of rows: ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++){
			//for space
			for (int k=n-i;k>=1;k--){
				System.out.print(" ");
			}
			//for print
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}System.out.println();
		}
	}
}