import java.util.*;
class scoreboard{
	static Scanner sc=new Scanner(System.in);
	String teamA;
	String teamB; 
	String player_name;
	String role;
	int run;
	int wicket;
	int num_overs;
	int overs=0;
	double balls;
	String status;
	String teamA_status;
	String teamB_status;
	boolean teamA_toss=false;
	boolean teamB_toss=false;
	public static void main(String args[]){
		scoreboard s=new scoreboard();
		s.teamName();
		System.out.print("enter no. of players: ");
		int num_player=sc.nextInt();
		scoreboard A[]=new scoreboard[num_player];
		scoreboard B[]=new scoreboard[num_player];
		
		
		System.out.println("Enter details of team "+s.teamA);
		//making array and giving player details for 1st team.
		for(int i=0; i<=num_player-1; i++){
			A[i]=new scoreboard();
			A[i].playerDet(i+1);
		}
		System.out.println();
		
		
		System.out.println("Enter details of team "+s.teamB);		
		//making array and giving player details for 2nd team.
		for(int i=0; i<=num_player-1; i++){
			B[i]=new scoreboard();
			B[i].playerDet(i+1);
		}
		System.out.println();
		
		
		System.out.println("TEAM "+s.teamA);
		//for display of each player details of team A.
		for(int i=0; i<=num_player-1; i++){
			A[i].display(i+1);
			System.out.println();
		}
		System.out.println("TEAM "+s.teamB);		
		
		//for display of each player details of team B.
		for(int i=0; i<=num_player-1; i++){
			B[i].display(i+1);
			System.out.println();
		}
		
		//calling method for toss
		s.toss();
		
		//method for choosing batting or balling
		s.assignbatball();
		
		//showing the team status.
		System.out.println(s.teamA+" has "+s.teamA_status);
		System.out.println(s.teamB+" has "+s.teamB_status);
		//method to start the match
		boolean bb4=true;
		while(bb4){
			System.out.println("press 1 to start the match or zero to exit");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
				s.start();
				bb4=false;
				break;
				case 0:
				System.out.println("you exit");
				bb4=false;
				break;
				default:
				System.out.println("ener only 0 or 1");
				break;
			}
		}
	}
	
	//method for assigning the names of each team.
	void teamName(){
		System.out.print("Enter name of team 1: ");
		teamA=sc.nextLine();
		System.out.print("Enter name of team 2: ");
		teamB=sc.nextLine();
	}
	
	//method for assigning the names of each player.
	void playerDet(int i){
		sc.nextLine();
		System.out.print("Enter name of player "+i+": ");
		player_name=sc.nextLine();
		System.out.println("-Press 1 for batsman");
		System.out.println("-Press 2 for bowler");
		System.out.println("-Press 3 for all-rounder");
		int n=sc.nextInt();
		System.out.println();
		boolean bb1=true;
		while(bb1){
			switch(n){
				
				case 1:
				role="batsman";
				bb1=false;
				break;
				
				case 2:
				role="bowler";
				bb1=false;
				break;
				
				case 3:
				role="all-rounder";
				bb1=false;
				break;
				
				default: 
				System.out.println("enter only 1,2,3");
				break;
			}
		}	
		run=0;
		wicket=0;
		status="not out";
	}
	
	//method for displaying details of the particular player
	void display(int i){
		System.out.println("Player "+i+"\n name: "+player_name);
		System.out.println(" role: "+role);
		System.out.println(" status: "+status);
	}
	
	
	//method for tosssing
	void toss(){
		boolean bb2=true;
		while(bb2){
			System.out.println("let team ==="+teamA+"=== select heads or tails");
			System.out.println("enter 0 for heads and 1 for tails");
			int toss=sc.nextInt();
			int coinflip=(int)(Math.random()*2);
			if(toss==0||toss==1){				
				if(toss==coinflip){
					System.out.println(teamA+" team has won the toss, now has chance to choose for batting or balling: ");
					teamA_toss=true;
					bb2=false;
				}else{
					System.out.println(teamA+" lost the toss, now team "+teamB+" has chance to choose for batting or balling: ");
					teamB_toss=true;
					break;
				}
			}else{
					System.out.println("enter 0 or 1 only");
					continue;
			}
		}
	}
	
	//method for choosing batting or balling.
	void assignbatball(){
		if(teamA_toss==true){
			System.out.println("press 1 for batting");
			System.out.println("press 2 for balling");
			int batball=sc.nextInt();
			boolean bb3=true;
			while(bb3){
				switch(batball){
					case 1:
					teamA_status="batting";
					teamB_status="balling";
					bb3=false;
					break;
					
					case 2:
					teamA_status="balling";
					teamB_status="batting";
					bb3=false;
					break;
					
					default:
					System.out.println("enter only 1 or 2");
					break;
				}
			}
		}else{
			System.out.println("press 1 for batting");
			System.out.println("press 2 for balling");
			int batball=sc.nextInt();
			boolean bb3=true;
			while(bb3){
				switch(batball){
					case 1:
					teamA_status="balling";
					teamB_status="batting";
					bb3=false;
					break;
					
					case 2:
					teamA_status="batting";
					teamB_status="balling";
					bb3=false;
					break;
					
					default:
					System.out.println("enter only 1 or 2");
					break;
				}
			}
		}
	}
	
	//method for match starting
	void start(){
		numover();
	}
	
	//method for changing runs
	void change_run(){
		System.out.print("Enter run's scored : ");
		int inc = sc.nextInt();
		run +=inc;
	}
	
	//method for wickets
	void change_wick(){
		wicket++;
	}
	
	//method for number of overs
	void numover(){
		System.out.println("enter number of overs: ");
		num_overs=sc.nextInt();
	}
}