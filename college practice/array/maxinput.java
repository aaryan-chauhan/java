import java.util.*;
//write a program to find max number from user input array .
class array {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int row=sc.nextInt();
		System.out.println("enter number of cols: ");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println("Enter value of element of row: "+i+" and col: "+j);
				a[i][j]=sc.nextInt();
			}
		}
		//for printing the araay of user input.
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]);
			}System.out.println();
		}
		int max=a[0][0];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(max<a[i][j]){
					max=a[i][j];
				}
			}
		}
		System.out.println("The max element is: "+max);
	}
}