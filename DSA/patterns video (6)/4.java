import java.util.*;
/*
   *
  ***
 *****
*******
*******
 *****
  ***
   *

*/
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++){
			//for space
			for(int k=n-i;k>=1;k--){
				System.out.print(" ");
			}
			//for print
			for (int j=1;j<=(i*2)-1;j++){
				System.out.print("*");
			}System.out.println();
		}	
		for (int i=1;i<=n;i++){
			//for space
			for(int k=1;k<i;k++){
				System.out.print(" ");
			}
			//for print
			for (int j=1;j<=((n-i)*2)+1;j++){
				System.out.print("*");
			}System.out.println();
		}
	}
}