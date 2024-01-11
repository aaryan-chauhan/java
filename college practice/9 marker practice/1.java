import java.util.*;
class College{
	static boolean bb=true;
	static int pass=1234;
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		login();
		enterMarks(0);
	}
	static void login(){
		System.out.println("welcome to Online Result Portal");
		int count=0;
		while(bb){
			count++;
			System.out.print("enter pass: ");
			int passcheck=sc.nextInt();
			if(pass==passcheck){
				System.out.println("Sucessful Login!");
				resetPassWord();
				break;
			}else{
				System.out.println("Invalid Password");
				if(count==2){
					System.out.print("Your account is locked for 1 hour");
					bb=false;
				}
				continue;
			}
		}
	}
	static void resetPassWord(){
		System.out.println("Reset Password");
		while(bb){			
			System.out.print("enter new Password: ");
			int newPass=sc.nextInt();
			if((newPass>999)&&(newPass<10000)){
				pass=newPass;
				break;
			}else{
				System.out.println("Invalid combination, enter valid password");
				continue;
			}
		}
	}
	void enterMarks(int count){
		if(count==6){
			return;
		}
		set(new int n[3]);
		enterMarks(count++);
	}
	void set(){
		
	}
}