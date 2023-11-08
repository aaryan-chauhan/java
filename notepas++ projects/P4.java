/*WAP to enter a character and check whether it is a vowel or consonant using
switch statement*/

import java.util.*;

class vovelConsonent{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any alphabet");
		char alphabet = sc.next().charAt(0);
		if((alphabet>=65&&alphabet<=91)||(alphabet>=97&&alphabet<=123)){
			switch(alphabet){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':System.out.print("entered alphabet is a vovel");
				break;
				default:System.out.print("it is a consonent");
			}
		}else{
			System.out.print("enter valid alphabet");
		}
	}
}