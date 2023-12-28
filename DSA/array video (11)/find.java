import java.util.*;
class find{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no of rows: ");
		int row=sc.nextInt();
		System.out.println("enter no of cols: ");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.println("enter element for row: "+i+"col: "+j);
				a[i][j]=sc.nextInt();
			}
		}
		int find=sc.nextInt();
		System.out.println("enter no: ");
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(a[i][j]==find){
					System.out.println("your no is situated at ("+(i+1)+","+(j+1)+")");
				}
			}
		}
	}
}