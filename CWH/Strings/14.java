class strings{
	public static void main(String[]args){
		String name="Aaryan";
		System.out.println(name);
		int length = name.length();
		System.out.println(length);
		String lstring=name.toLowerCase();
		System.out.println(lstring);
		String ustring=name.toUpperCase();
		System.out.println(ustring);
		String spaceString="       aaryan     ";
		System.out.println(spaceString);
		System.out.println(spaceString.trim());
		System.out.println(name.replace('r','a'));
		System.out.println(name.charAt(2));
		System.out.println(name.endsWith("an"));
		System.out.println(name.endsWith("a"));
		System.out.println(name.startsWith("Aa"));
		System.out.println(name.startsWith("n"));
		System.out.println(name.equals("aaryan"));
		System.out.println(name.equalsIgnoreCase("aaryan"));
		System.out.println(name.equals("Aaryan"));
		
	}
}