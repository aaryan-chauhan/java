/*
    *
   ***
  *****
 *******
*********
*/
class patterns{
	public static void main(String args[]){
		int n=5;
		for (int i=1;i<=5;i++){
			//for space
			for(int k=n-i;k>=1;k--){
				System.out.print(" ");
			}
			//for print
			for (int j=1;j<=(i*2)-1;j++){
				System.out.print("*");
			}System.out.println();
		}
	}
}