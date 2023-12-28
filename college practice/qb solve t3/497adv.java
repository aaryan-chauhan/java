import java.util.*;
class Main{
	static int repeat=1;
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		while(repeat==1){
			System.out.println("enter '1' to continue and '0' to stop: ");
			repeat=sc.nextInt();
			if(repeat==1){
				while(repeat==1){
					
					if(repeat==1){
						System.out.println("enter your number: ");
						int n=sc.nextInt();
						count c1=new count();
						if(c1.count(n)==n){
							System.out.println("armstrong");
						}else{
							System.out.println("not armstrong");
						}
					}else if(repeat==0){
						repeat=0;
						break;
					}else{
						System.out.println("enter only '1' or '0' : ");
						continue;
					}
					
					System.out.println("enter '1' to continue and '0' to stop: ");
					repeat=sc.nextInt();
				}
			}else if(repeat==0){
				break;
			}else{
				
				System.out.println("enter only '1' or '0' : ");
				repeat=sc.nextInt();
				continue;
			}
		}
	}
}
class count{
	int r,count,armstrong;
	int count(int num){
		int n=num;
		while(num>0){
			r=num%10;
			count++;
			num/=10;
		}
		while(n>0){
			r=n%10;
			armstrong+=Math.pow(r,count);
			n/=10;
		}
		return armstrong;
	}
}