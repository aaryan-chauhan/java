import java.util.*;
/*
1
2  3
4  5   6
7  8   9 10 
11 12 13 14 15
*/
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of rows: ");
		int n=sc.nextInt();
		//using another variable
		int num=1;
		for (int i=1;i<=n;i++){
			for (int j=1;j<=i;j++){
				System.out.print(num+" ");
				num++;
			}System.out.println();
		}
		
	}
}