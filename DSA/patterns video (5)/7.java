import java.util.*;
/*
1
12
123
1234
12345
*/
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of rows: ");
		int n=sc.nextInt();
		//normal logic
		for (int i=1;i<=n;i++){
			for (int j=1;j<=i;j++){
				System.out.print(j);
			}System.out.println();
		}
		//using another variable
		for (int i=1;i<=n;i++){
			int num=1;
			for (int j=1;j<=i;j++){
				System.out.print(num);
				num++;
			}System.out.println();
		}
		
	}
}