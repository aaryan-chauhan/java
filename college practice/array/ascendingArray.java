//asending order array.
class ascending {
	public static void main(String[]args){
		int a[]={10,20,30,80,50,40,100};
		for(int i=0;i<a.length;i++){
			for (int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int x:a){
			System.out.println(x);
		}
	}
}