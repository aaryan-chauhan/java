import java.util.*;
/*
1
01
101
0101
10101
*/
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of rows: ");
		int n=sc.nextInt();
		//using another variable
		for (int i=1;i<=n;i++){
			for (int j=1;j<=i;j++){
				if((i+j)%2==0){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
			}System.out.println();
		}
		//using complete if else
		for (int i=1;i<=n;i++){
			for (int j=1;j<=n;j++){
				if(((i+j)%2==0)&&(i>=j)){
					System.out.print("1");
				}else if(((i+j)%2!=0)&&(i>=j)){
					System.out.print("0");
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
			
	}
}