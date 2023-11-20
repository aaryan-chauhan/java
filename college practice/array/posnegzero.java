//write a program to find the number of positive negetive and zeros in given array.
class array{
	public static void main(String[]args){
		int a[][]={{10,20,0},{-10,0,-30},{-40,50,60},{0,0,-50}};
		int countpos=0;
		int countneg=0;
		int countzero=0;
		//for printing the array and max and min element of it.
		int max=a[0][0];
		int min=a[0][0];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]);
				if(max<a[i][j]){
					max=a[i][j];
				}
				if(min>a[i][j]){
					min=a[i][j];
				}
			}System.out.println();
		}
		System.out.println("Max: "+max+" Min: "+min);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]>0){
					countpos++;
				}else if(a[i][j]<0){
					countneg++;
				}else{
					countzero++;
				}
			}
		}
		System.out.println("number of positives: "+countpos);
		System.out.println("number of negetives: "+countneg);
		System.out.println("number of zeros: "+countzero);
	}
}