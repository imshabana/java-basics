package JavaBasics;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2020;
				
		if((year%4)==0)
		{if((year%100)==0)
			{if((year%400)==0)
			{
				System.out.println("this is leap year");
			}
			else {
				System.out.println("this is leap year");
			}
		}
		else
		{
			System.out.println("this is leap year");
		}
		}
		else 
		{
			System.out.println("this is not a leap year");
		}
	}

}
