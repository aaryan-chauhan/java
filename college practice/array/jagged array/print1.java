//print a jagged array with charachter.
class ja{
	public static void main(String args[]){
		int a[][]=new int [6][];
		a[0]=new int[1];
		a[1]=new int[3];
		a[2]=new int[4];
		a[3]=new int[2];
		a[4]=new int[1];
		a[5]=new int[3];
		char z = 'A';
		System.out.println(a);
		for(int i=0;i<a.length;i++){
			for (int j=0;j<a[i].length;j++){
				System.out.print(z+" ");
				z++;
			}System.out.println();
		}
	}
}