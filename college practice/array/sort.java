import java.util.*;
class print{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		print o=new print();
		int temp=1;
		o.print(temp,row);
	}
	void print(int temp,int row){
		if(temp>=row){
			return;
		}
		temp++;
		printCol(temp);
		System.out.println();
		print(temp,row);
	}
	void printCol(int col){
		if(col==0){
			return;
		}
		System.out.print("*");
		printCol(col--);
	}
}