//write a program to find max number from the user input array
import java.util.*;
class maxArray{
	puclic static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=sc.nextInt();
		System.out.println("enter number of cols");
		int col=sc.nextInt();
		int [][]a=new int[row][col];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0.length];j++){
				System.out.println("enter element");
				int a[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]);
			}System.out.println();
		}
		
	}
}