//write a program to find transpose of user input square array and display it.
import java.util.*;
class array{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("make a square matrix");
		System.out.println("enter number of rows");
		int rows=sc.nextInt();
		System.out.println("enter number of cols");
		int cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		int b[][]=new int[a[0].length][a.length];
		if(rows==cols){
			//array input
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					System.out.println("enter element of row: "+i+" col: "+j);
					a[i][j]=sc.nextInt();
				}
			}
			//print user input array
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					System.out.print(a[i][j]);
				}System.out.println();
			}
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					b[j][i]=a[i][j];
				}
			}
			//for pirinting transpose
			System.out.println("transpose of abpve matrix is:");
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					System.out.print(b[i][j]);
				}System.out.println();
			}
		}else{
		System.out.println("enter vlaid square matirx");
		}
	}
}