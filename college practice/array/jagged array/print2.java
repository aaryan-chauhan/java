class ja{
	public static void main(String args[]){
		char a[][]=new char[6][];
		a[0]=new char[1];
		a[1]=new char[2];
		a[2]=new char[3];
		a[3]=new char[4];
		a[4]=new char[5];
		a[5]=new char[6];
		char z='A';
		for(int i=0;i<a.length;i++){
			for (int j=0;j<a[i].length;j++){
				System.out.print("\\");
			}System.out.println();
		}
		System.out.println();
		for(int i=0;i<a.length;i++){
			for (int j=0;j<a[i].length;j++){
				System.out.print(z);z++;
			}System.out.println();
		}
	}
}