import java.util.*;
/*
    1
   212
  32123
 4321234
543212345
*/
class patterns{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no of rows: ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++){
			//for space
			for(int k=n-i;k>=1;k--){
				System.out.print(" ");
			}
			//for print half
			int print=i;             //temporary it will store i to perform decrement.
			for (int j=1;j<=i;j++){
				System.out.print(print);
				print--;
			
			}
			//for printing second half
			for(int l=1;l<=i;l++){
				if(l==1){
					System.out.print("");//because we dont have to print once again.
				}else{
					System.out.print(l);
				}
			}
			System.out.println();
		}
	}
}