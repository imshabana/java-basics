package JavaBasics;

public class Constuctoroverloading {
	
	Constuctoroverloading(String name)
	{
		System.out.println(name);
	}
	
	Constuctoroverloading(int age)
	{
		System.out.println(age);
	}
	Constuctoroverloading(long mobile)
	{
		System.out.println(mobile);
	}
	
	public static void main(String[]args) {

		new Constuctoroverloading("SHABANA");
		new Constuctoroverloading(26);
		new Constuctoroverloading(987654321);
		
	}
	
	
	
}
