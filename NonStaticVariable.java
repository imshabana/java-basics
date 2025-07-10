package JavaBasics;

public class NonStaticVariable {
	int a=20;
	int b=30;
	public static void add()
	{
		NonStaticVariable n1 = new NonStaticVariable();
		
		System.out.println("addition"+(n1.a+n1.b));
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();
	}

}
