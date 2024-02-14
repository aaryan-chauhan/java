import java.util.*;
class scoreboard{
	static Scanner sc=new Scanner(System.in);
	String teamA;
	String teamB; 
	String player_name;
	String role;
	int number;
	int run;
	int wicket;
	int num_overs;
	double oversA=1;
	double oversB=1;
	int balls;
	int ballsA;
	int ballsB;
	String status;
	String teamA_status;
	String teamB_status;
	boolean teamA_toss=false;
	boolean teamB_toss=false;
	int teamA_runs;
	int teamB_runs;
	public static void main(String args[]){
		scoreboard s=new scoreboard();
		s.teamName();
		System.out.print("enter no. of players: ");
		int num_player=sc.nextInt();
		s.number=num_player;
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
				s.start(A,B);
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
		boolean bb1=true;
		while(bb1){
			int n=sc.nextInt();
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
				System.out.println("enter only 1 or 2 or 3");
				break;
			}
		}	
		run=0;
		status="not out";
	}
	
	//method for displaying details of the particular player
	void display(int i){
		System.out.println("Player "+i+"\n name: "+player_name);
		System.out.println(" role: "+role);
	}
	
	//method for displaying player details of team A.
	void dis_plyr_det(scoreboard A){ 
		System.out.println("runs made by"+A.player_name+" are: "+A.run);
		System.out.println("Strike rate: ");
		A.status="out";
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
			boolean bb3=true;
			while(bb3){
				System.out.println("press 1 for batting");
				System.out.println("press 2 for balling");
				int batball=sc.nextInt();
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
			boolean bb3=true;
			while(bb3){
				System.out.println("press 1 for batting");
				System.out.println("press 2 for balling");
				int batball=sc.nextInt();
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
					System.out.println("enter only 1 or 2\n\n");
					break;
				}
			}
		}
	}
	
	//method for match starting
	void start(scoreboard A[],scoreboard B[]){
		numover();
		if(teamA_status.equalsIgnoreCase("batting")){
			teamA_runs=1;
			inning_A(A,B);
			inning_B(A,B);
		}else{
			teamB_runs=1;
			inning_B(A,B);
			inning_A(A,B);
		}
	}
	
	//method for changing runs of A
	void change_runA(int inc,scoreboard A){
		teamA_runs +=inc;
		A.run+=inc;
	}
	//method for changing runs of B
	void change_runB(int inc,scoreboard B){
		teamB_runs +=inc;
		B.run+=inc;
	}
	
	//method for wickets
	void change_wick(){
		wicket++;
	}
	
	//method for number of overs
	void numover(){
		System.out.println("enter number of overs: ");
		num_overs=sc.nextInt();
		num_overs+=1;
	}
	
	//method for innings of teamA
	void inning_A(scoreboard A[],scoreboard B[]){
		wicket=0;
		int plyr_noB=0;
		int plyr_noA=0;
		double oversA_dis=0;
		if (teamB_runs==0){
			System.out.println("not working");
		}else{
			boolean bb5=true;
			while(bb5){
				if(teamB_runs<teamA_runs||oversA>num_overs){
					bb5=false;
				}else if(wicket!=this.number){		
					for(int i=1;i<num_overs;i++){
						for(int j=1;j<=6;j++){
							boolean bb6=true;
							ballsA++;
							oversA_dis=i+(double)(j/10);
							System.out.println("batsman from "+teamA+" is: "+A[plyr_noA].player_name);
							System.out.println("bowler from "+teamB+" is: "+B[plyr_noB].player_name);
							while(bb6){
								System.out.println("enter 1-6  to increase runs, 5 runs cant be inputed or w for wicket");
								System.out.print("over: "+oversA_dis+": ");
								sc.nextLine();
								String choice=sc.nextLine();
								if(choice.equalsIgnoreCase("w")){
									wicket++;
									A[plyr_noA].status="out";
									A[plyr_noA].balls++;
									dis_plyr_det(A[plyr_noA++]);
									if(wicket==number){
										System.out.println("team all out! on "+oversA_dis+" overs.");
										System.out.println("team "+teamA+" lost");
										bb6=false;
										bb5=false;
									}
									System.out.println("runs scored are: "+teamA_runs);
									System.out.println("with loss of: "+(++wicket)+" wickets");
								}else if(Integer.parseInt(choice)>=1&&Integer.parseInt(choice)<=6&&Integer.parseInt(choice)!=5){
									change_runA(Integer.parseInt(choice),A[plyr_noA]);
									bb6=false;
								}else{
									System.out.println("invalid input enter again");
									continue;
								}
							}
						}
						plyr_noB++;
						oversA++;
					}
				}
			}
			if(teamB_runs<teamA_runs){
				System.out.println(teamA+" won the match!");
			}else if(oversA>num_overs){
				System.out.println(teamA+" lost the match the match!");
				System.out.println(teamB+" won the match the match!");
			}
			
		}
	}
	
	//method for innings of teamB
	void inning_B(scoreboard A[],scoreboard B[]){
		
	}
}