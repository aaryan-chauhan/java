import java.util.*;
/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			//for space
			for(int k=n-i;k>=1;k--){
				System.out.print(" ");
			}
			//for printing
			for (int j=1;j<=i;j++){
				System.out.print(i+" ");
			}System.out.println();
		}
	}
}