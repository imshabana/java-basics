package JavaBasics;

public class CaluculatorMethodoverloading{
	
	
	 void main(int A )
	{
		System.out.println("method 1 will execute");
	}

	void main(long B )
	{
		System.out.println("method 2 will execute");
	}
	
   void  main(int A,int B)
	{
		System.out.println("method 3 will execute");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaluculatorMethodoverloading c1=new CaluculatorMethodoverloading();
	c1.	main(8);
		c1.main(5,8);
		

	}

}
