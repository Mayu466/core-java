class AllBlock{
	AllBlock()
	{
		System.out.println("....constructor.....");
	}
		// java create constructor if developer not create and if developer create then java consider that on

	public void m1()
	{
		System.out.println("......m1 method of All block......");
	}
	
	public void m2()
	{
		System.out.println(".......m2 method ......");
	}
	
	//Entry point//Main Method
	public static void main(String [] args)

	{
		System.out.println("Main method");

		AllBlock a = new AllBlock();     //Constructor create 
		a.m1();	//method calling 
		a.m2();
	}


}