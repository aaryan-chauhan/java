//with return with argument area perimeter using command line argument.
class areaperi{
		int area(int l,int b){
		int area=l*b;
		return area;
	}
	int perimeter(int l,int b){
		int perimeter=2*(l+b);
		return perimeter;
	}
	public static void main(String args[]){
		areaperi ap1=new areaperi();
		int al=Integer.parseInt(args[0]);
		int ab=Integer.parseInt(args[1]);
		System.out.println("area: "+ap1.area(al,ab));
		int pl=Integer.parseInt(args[2]);
		int pb=Integer.parseInt(args[3]);
		System.out.println("perimeter: "+ap1.perimeter(pl,pb));
	}
}