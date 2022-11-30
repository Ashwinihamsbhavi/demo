package Abstract1;
abstract class Sample
{
	abstract void disp();
	abstract void ho();
}
class Demo extends Sample
{
	void disp()
	{
		System.out.println("dispuuu");
	}
	void ho()
	{
		System.out.println("hooo");
	}
}
	class Sample1
	{
		public static void main(String[]args)
		{
			Demo d1=new Demo();
			d1.disp();
			d1.ho();
		}
	}
