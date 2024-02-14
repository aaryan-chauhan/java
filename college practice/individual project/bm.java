import java.util.*;
class bankManagement{
	String acc_no;
	String acc_type;
	String name;
	long balance;
	static Scanner sc=new Scanner (System.in);
	
	//METHOD TO open new amount
	void setBankDetails(){
		System.out.print("Enter account number: ");
		acc_no=sc.next();
		System.out.print("Enter account type: ");
		acc_type=sc.next();
		System.out.print("Enter name: ");
		name=sc.next();
		System.out.print("Enter balance: ");
		balance=sc.nextLong();
	}
	
	//METHOD TO display ACCOUNT DETAILS
	void displayAccount(){
		System.out.println("name of account holder is: "+ name );
		System.out.println("account number is: "+ acc_no );
		System.out.println("account type is: "+ acc_type );
		System.out.println("balance is: "+ balance );
	}
	
	//METHOD TO deposit MONEY
	void deposit(){
		long amt;
		System.out.print("enter amount you want to deposit: " );
		amt=sc.nextLong();
		balance+=amt;
	}
	
	//METHOD TO withdraw MONEY
	void withdraw(){
		long amt;
		System.out.print("enter amount you want to deposit: " );
		amt=sc.nextLong();
		if(balance>=amt){
			balance-=amt;
			System.out.println("balance after withdrawal is: "+ balance );
		}else{
			System.out.println("balance is less then "+amt+" transaction failed");
		}
	}
	
	//METHOD TO SEARCH ACCOUNT NUMBER
	boolean search(String acc_no){
		if(acc_no.equalsIgnoreCase(acc_no)){
			displayAccount();
			return true;
		}return false;
	}
	
	//MAIN METHOD
	public static void main(String args[]){
		
		System.out.print("how many customers do you want to input: ");
		int n=sc.nextInt();
		bankManagement b[]=new bankManagement[n];
		for(int i=0;i<b.length;i++){
			b[i]=new bankManagement();
			b[i].setBankDetails();
		}
		boolean bb=true;
		while(bb){
			System.out.println("=====BANKING SYSTEM APPLICATION====");
			System.out.println("press 1 for displaying all account details");
			System.out.println("press 2 for searching by account number");
			System.out.println("press 3 for depositing the amount");
			System.out.println("press 3 for withdrawing the amount");
			System.out.println("press 3 for exiting");
			int nn=sc.nextInt();
			switch(nn){
				case 1 :
				for(int i=0;i<b.length;i++){
					b[i].displayAccount();
				}
				break;
				case 2 :
				System.out.println("enter account number you want to search: ");
				boolean found=false;
				String acc_no=sc.next();
				for(int i=0;i<b.length;i++){
					found=b[i].search(acc_no);
					if(found){
						break;
					}
				}
				if(!found){
					System.out.println("search failed!... account doesnt exist");
				}
				break;
				case 3 :
				System.out.println("enter account number: ");
				found=false;
				acc_no=sc.next();
				for(int i=0;i<b.length;i++){
					found=b[i].search(acc_no);
					if(found){
						b[i].deposit();
						break;
					}
				}
				if(!found){
					System.out.println("search failed!... account doesnt exist");
				}
				break;
				
				case 4 :
				System.out.println("enter account number: ");
				found=false;
				acc_no=sc.next();
				for(int i=0;i<b.length;i++){
					found=b[i].search(acc_no);
					if(found){
						b[i].withdraw();
						break;
					}
				}
				if(!found){
					System.out.println("search failed!... account doesnt exist");
				}
				break;
				case 5: 
				System.out.println("see you soon... you exit!");
				default:
				System.out.println("invalid input enter again");				
			}
		}
	}
}