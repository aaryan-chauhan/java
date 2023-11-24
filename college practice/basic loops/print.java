import java.util.*;
class loop{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any natural number");
		int n=sc.nextInt();
		//1. print upto n numbers by user input
		for (int i=1;i<=n;i++){
			System.out.println(i);
		}
		//1. using while loop
		int b=1;
		while(b<=n){
			System.out.println(b);
			b++;
		}
		//2. print upto n numbers by user input in reverse
		for(int i=n;i>0;i--){
			System.out.println(i);
		}
		//2. using while loop
		b=n;
		while(b>0){
			System.out.println(b);
			b--;
		}
		//3. print a-z
		for(char i='a';i<='z';i++){
			System.out.println(i);
		}
		//3. using while loop.
		char c='a';
		while(c<='z'){
			System.out.println(c);
			c++;
		}
		//4. print even numbers from 1-100
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		//4. using while loop
		b=1;
		while(b<=100){
			if(b%2==0){
				System.out.println(b);
			}
			b++;
		}
		//5. print odd numbers from 1-100
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
		//5. print odd numbers from 1-100
		b=1;
		while(b<=100){
			if(b%2!=0){
				System.out.println(b);
			}
			b++;
		}
		//6. sum of all natural numbers from 1-n.
		int sum=0;
		for (int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println("the sum of all natural numbers from 1-"+n+" using for is: "+sum);
		//6. using while loop.
		b=n;
		sum=0;
		while(b>0){
			sum+=b;
			b--;
		}
		System.out.println("the sum of all natural numbers from 1-"+n+" using while is: "+sum);
		//7. sum of all even natural numbers from 1-n.
		sum=0;
		for (int i=1;i<=n;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println("the sum of even numbers from 1-"+n+" using for is: "+sum);
		//7. using while loop
		b=n;
		sum=0;
		while(b>0){
			if(b%2==0){
				sum+=b;
			}
			b--;
		}
		System.out.println("the sum of even numbers from 1-"+n+" using while is: "+sum);
		//8. sum of all odd natural numbers from 1-n.
		sum=0;
		for (int i=1;i<=n;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println("the sum of odd numbers from 1-"+n+" using for is: "+sum);
		//8. using while loop
		b=n;
		sum=0;
		while(b>0){
			if(b%2!=0){
				sum+=b;
			}
			b--;
		}
		System.out.println("the sum of odd numbers from 1-"+n+" using while is: "+sum);
		//9. multiplication table of user input.
		System.out.println("table of: "+n+" using for");
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+n*i);
		}
		//9. using while loop
		System.out.println("table of: "+n+" using while");
		b=1;
		while(b<=10){
			System.out.println(n+"*"+b+"="+n*b);
			b++;
		}
		//10. count number of digits in a number.
		System.out.println("enter big int for counting digits it has");
		int bigint=sc.nextInt();
		int count=0;
		int num=bigint;
		while(bigint>0){
			count++;
			bigint/=10;
		}System.out.println("no. of digits "+num+" has: "+count);
		//11. print first and last digits of number given by user.
		int firstdig,lastdig=0;
		lastdig=num%10;
		while(num>0){
			firstdig=num%10;
			num=num/10;
		}
		System.out.println("the first number is: "+firstdig);
		System.out.println("the last number is: "+lastdig);
		//12. find sum of first and last digit of number entered.
		int flsum=firstdig+lastdig;
		System.out.println("the sum of first and last digit is: "+flsum);
		
	}
}
