import java.util.*;
class transpose{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no of rows: ");
		int row=sc.nextInt();
		System.out.println("enter no of cols: ");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[col][row];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.println("enter element for row: "+i+"col: "+j);
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				b[j][i]=a[i][j];
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(a[i][j]);
			}System.out.println();
		}
		System.out.println("transpose is: ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(b[i][j]);
			}System.out.println();
		}		
	}
}