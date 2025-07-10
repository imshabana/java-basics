package JavaBasics;

interface oneA
{   int a=10;
    int b=20;
	void add();
}

interface oneB  
{   int c=38;
int d=70;
	void sub();
}



public class Interfaceprogram  implements oneB,oneA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceprogram inter =new Interfaceprogram();
		inter.add();
		inter.sub();
	}

	@Override
	public void add() {
		System.out.println(a+b);
		
	}

	@Override
	public void sub() {
		
		System.out.println(a-b);
	}

	
}
