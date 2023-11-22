//print lower triangular matrix of the user in put matrix.
import java.util.*;
class ja{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Square matrix");
		System.out.println("enter no of rows");
		int row=sc.nextInt();
		System.out.println("enter no of cols");
		int col=sc.nextInt();
		if(row==col){
			//for user input array
			int a[][]=new int[row][col];
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					System.out.println("enter value of row "+i+" and col "+j);
					a[i][j]=sc.nextInt();
				}
			}
			//for printing user input array with for loop.
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					System.out.print(a[i][j]);
				}System.out.println();
			}
			System.out.println();
			//for printing user input array with for-each loop.
			for(int x[]:a){
				for(int y:x){
					System.out.print(y);
				}System.out.println();
			}System.out.println();
			//for printing lower triangular matrix.
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					if(j>i){
						a[i][j]=0;
					}else{
						System.out.print(a[i][j]);
					}
				}System.out.println();
			}
		}else{
			System.out.println("enter valid square matrix");
		}
	}
}