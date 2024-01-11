/*Create a class name Temperature in which create methods of given name
ferenhit(), celcius() to perform basic conversion. Call all this methods using class
named Main.*/
class temprature{
	void ferenhit(int c){
		System.out.println("temprature in ferenhit is: "+((c*9/5)+32));
	}
	void celcius(int f){
		System.out.println("temprature in ferenhit is: "+((f-32)*5/9));
		
	}
}
class main{
	public static void main(String args[]){
		temprature t=new temprature();
		t.ferenhit(100);
		t.celcius(212);
	}
}