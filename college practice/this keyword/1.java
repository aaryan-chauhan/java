class main{
	int mark1,mark2;
	public static void main(String args[]){
		main m=new main();
		System.out.println(m.mark1+""+m.mark2);
	}
	main(){
		this(5);
		System.out.println("hello");
	}
	main(int five){
		System.out.println(five);
	}
}