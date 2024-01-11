import java.util.*;
class cricket{
	static Scanner sc = new Scanner(System.in);
	double run=0;
	double wicket = 0;
	double balls = 0.0;
	double overs = 0.0;
	int num_overs;
	void change_run(){
		System.out.print("Enter run's scored : ");
		int inc = sc.nextInt();
		run = run+inc;
	}
	void change_wick(){
		wicket++;
	}
	void overs(){
		if(balls<=0.4){
			balls += 0.1;
		}
		else{
			overs +=1;
			balls = 0.0;
		}
	}
	void display(){
		System.out.println("RUN'S = "+run);
		System.out.println("WICKET'S = "+wicket);
		System.out.println("OVER'S = "+(overs+balls));
	}
	void numover(){
		System.out.println("enter number of overs: ");
		num_overs=sc.nextInt();
	}
	public static void main(String[]args){
		cricket c = new cricket();
		c.numover();
		while((int)c.overs<c.num_overs){
			if(c.balls==0.0){
				c.display();
			}
			System.out.println("Enter 1 to update runs");
			System.out.println("Enter 2 to update wicket");
			System.out.println("Enter 3 for dot ball ");
			System.out.println("Enter 4 for displaying ");
			c.overs();
			int choice = sc.nextInt();
			switch(choice){
				case 1 : c.change_run();
				break;
				case 2 : c.change_wick();
				break;
				case 3 : 
				break;
				case 4 : 
				c.balls-=0.1;
				c.display();
				break;
				default : System.out.println("Enter valid numbers");
				break;
			}
		}
		c.display();
	}
}	