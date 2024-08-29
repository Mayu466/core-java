class Variable{

	int rollnumber = 10;//global variable
	String name = "Mayuri";
	String add = "Sangli";	
	
	public void m1()
	{
		int id = 200;
		String name = "abc";
		Variable v1 = new Variable();
		System.out.println(id);//in the method we call variable directly	
		System.out.println(name);

	}

	public static void main(String[] args)
	{
		System.out.println("Variable test example" );
		Variable v = new Variable();
		System.out.println(v.rollnumber);
		System.out.println(v.add);
		System.out.println(v.name);
		v.m1();
	}

}