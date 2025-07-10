package JavaBasics;

public class thiscallingprogram {
	thiscallingprogram(String name)
	{
		
		System.out.println(name);
	}
	
	thiscallingprogram(int a,int b,int c)
	{
		
	this("shabana");
		System.out.println("addition of numbers"+(a+b+c));
	}
	
	thiscallingprogram(int a,int b)
	{ 
	this(6,8,9);
		System.out.println("multiplication"+(a*b));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	new	thiscallingprogram(4,7);

}
	}