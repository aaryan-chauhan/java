import java.util.*;
/*

1.
*
**
***
****
*****

2.
*****
****
***
**
*

3.
*****
 ****
  ***
   **
	*

4.
    *
   **
  ***
 ****
*****

*/
class patterns{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any positive integer");
		int n=sc.nextInt();
		if(n>0){
		//for 1
		
		System.out.println("1");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}System.out.println();
		}
		
		//for 2
		
		System.out.println("2");
		for(int i=1;i<=n;i++){
			for(int j=n-i+1;j>=1;j--){
				System.out.print("*");
			}System.out.println();
		}
		
		//for 3
		
		System.out.println("3"); 
		for(int i=n;i>=1;i--){
			//code for space
			for(int k=n-1;k>=1;k--){
				System.out.print(" ");
			}
			//code for printing 
			for(int j=n-i;j<=n-1;j++){
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("4");
		
		}else{
			System.out.println("enter valid number");

		}
		
		
		
	}
}


