class Demo 
{
	int x=10;
}
class Pemocha extends Demo
{
	void ho()
	{
		System.out.println("hey");
	}
}
class Mainclass1
{
	public static void main(String[] args) 
	{
		Demo D1= new Pemocha();
       System.out.println(D1.x);

	   Pemocha P1=(Pemocha)D1;
	   System.out.println(P1.x);
	   P1.ho();
	}
}
