class array{
	public static void main(String args[]){
		int a []={7,8,3,1,2};
		bubblesort(a);
		System.out.println();
		simsort(a);
	}
	static void print(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	static void insertsort(){
		
	}
	static void simsort(int a[]){
		//simple sort
		for(int i=0;i<a.length;i++){
			int small=i;
			for(int j=i+1;j<a.length-1;j++){
				if(a[small]>a[j]){
					small=j;
				}
			}
			int temp=a[small];
			a[small]=a[i];
			a[i]=temp;
		}
		print(a);
	}
	static void bubblesort(int a[]){
		//bubble sort
		for(int i=0;i<a.length;i++){
			for (int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		print(a);
	}
}