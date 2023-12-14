import java.util.*;
/*
12345
1234
123
12
1
*/
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of rows: ");
		int n=sc.nextInt();
		//normal logic
		for (int i=1;i<=n;i++){
			for (int j=i;j<=n;j++){
				System.out.print(j);
			}System.out.println();
		}
		//using another variable
		for (int i=n;i>=1;i--){
			int num=1;
			for (int j=i;j>=1;j--){
				System.out.print(num);
				num++;
			}System.out.println();
		}
		
		
	}
}