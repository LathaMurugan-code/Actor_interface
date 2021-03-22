class ActorSivakumar implements Actor
{
	static String address = "coimbatore";
	int age;
	String car_name;
	ActorSivakumar()
	{
		System.out.println("Senior actor from actor interface");
	}

	ActorSivakumar(int age, String car_name)
	{
		this.age = age;
		this.car_name = car_name;
	}
	public void speaking()
	{
		System.out.println("He speaks kongu tamil well");
	}
	public void dance()
	{
		System.out.println("He dances classical dance well");
	}
	public void act()
	{
		System.out.println("He act commercial films");
	}
	public void sing()
	{
		System.out.println("He is carnatic singer");
	}
	
	public static void main ( String args[])
	{
		ActorSivakumar suryaDad = new ActorSivakumar(65,"Audi car");
		suryaDad.speaking();
		suryaDad.dance();
		suryaDad.act();
		suryaDad.sing();
		System.out.println("is makeup needed? "+suryaDad.makeUpRequired);
		System.out.println("Age= "+suryaDad.age +" "+"address= "+suryaDad.address +" "+ "car_name= "+suryaDad.car_name);
		Actor senior = new ActorSivakumar();
		//senior.speaking();
		senior.dance();
		senior.act();
		senior.sing();
		System.out.println("is makeup needed"+senior.makeUpRequired);
		System.out.println("Address= "+senior.address);
		//System.out.println("Age= "+senior.age +" "+"address= "+senior.address +" "+ "car_name= "+senior.car_name);
	}
}
		
		
		
	
		
